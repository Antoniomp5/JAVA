package PROYECTO;

import java.awt.BorderLayout;

import java.io.File;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class VentanaPrincipal extends JFrame {

    private String usuario;
    private int saldo = 100;

    private JTextArea areaJuegos;
    
    private static EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("videojuegos.odb");

    public VentanaPrincipal(String usuario) {

        this.usuario = usuario;

        setTitle("Catálogo de Juegos");
        setSize(600, 500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());
        // BorderLayout ya que coloca componentes por zonas
        // ===================== PARTE SUPERIOR =====================
        JPanel panelSuperior = new JPanel(new BorderLayout());

        JLabel lblUsuario = new JLabel("Usuario: " + usuario);
        JLabel lblSaldo = new JLabel("Saldo: " + saldo + "€");

        panelSuperior.add(lblUsuario, BorderLayout.WEST);
        panelSuperior.add(lblSaldo, BorderLayout.EAST);

        add(panelSuperior, BorderLayout.NORTH);

        // ===================== LISTADO =====================
        areaJuegos = new JTextArea();
        areaJuegos.setEditable(false);

        JScrollPane scroll = new JScrollPane(areaJuegos);

        add(scroll, BorderLayout.CENTER);

        cargarJuegos();
        cargarDesdeBD();

        setVisible(true);
    }

    // ===================== LEER XML =====================
    private void cargarJuegos() {

        try {

            File file = new File("videojuegos.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();

            Document doc = builder.parse(file);

            NodeList lista = doc.getElementsByTagName("juego");

            String texto = "";

            for (int i = 0; i < lista.getLength(); i++) {

                Node nodo = lista.item(i);

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {

                    Element e = (Element) nodo;

                    String nombre = e.getElementsByTagName("nombre").item(0).getTextContent();
                    String empresa = e.getElementsByTagName("empresa").item(0).getTextContent();
                    String precio = e.getElementsByTagName("Precio").item(0).getTextContent();

                    texto += "Juego: " + nombre + "\n";
                    texto += "Empresa: " + empresa + "\n";
                    texto += "Precio: " + precio + "€\n";
                    texto += "--------------------------\n";
                }
            }

            areaJuegos.setText(texto);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer XML");
        }
    }
    
    // ===================== CARGAR BD =====================
    
    private void cargarDesdeBD() {

        EntityManager em = emf.createEntityManager();
        
    	List<Juegos> lista = em.createQuery("SELECT j FROM Juegos j", Juegos.class)
                .getResultList();

    	if (lista.isEmpty()) {
    			areaJuegos.setText("No hay juegos en la base de datos");
    			return;
    		}
    	
    	System.out.println(em.createQuery("SELECT j FROM Juegos j", Juegos.class)
                .getResultList().size());

        try {

            String texto = "";

            for (Juegos j : em.createQuery("SELECT j FROM Juegos j", Juegos.class)
                              .getResultList()) {

                texto += "Juego: " + j.getTitulo() + "\n";
                texto += "Empresa: " + j.getEmpresa_creadora() + "\n";
                texto += "Precio: " + j.getPrecio() + "€\n";
                texto += "--------------------------\n";
            }

            areaJuegos.setText(texto);

        } catch (Exception e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al leer la base de datos");

        } finally {
            em.close();
            emf.close();
        }
    }
}


