package ejercicios;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class Ejercicio5 {

    public static void main(String[] args) {

        Frame ventana = new Frame("Titulo");
        ventana.setSize(400, 300);
        ventana.setLayout(new BorderLayout());

        // Etiqueta
        Label lblTexto = new Label("Texto de prueba", Label.CENTER);
        lblTexto.setFont(new Font("Arial", Font.PLAIN, 14));
        ventana.add(lblTexto, BorderLayout.CENTER);

        // Barra de menú
        MenuBar barra = new MenuBar();

        Menu menuEstilo = new Menu("Estilo");
        MenuItem itemNegrita = new MenuItem("Negrita");
        MenuItem itemNormal = new MenuItem("Normal");

        menuEstilo.add(itemNegrita);
        menuEstilo.add(itemNormal);

        Menu menuColor = new Menu("Color");
        MenuItem itemRojo = new MenuItem("Rojo");
        MenuItem itemAzul = new MenuItem("Azul");
        MenuItem itemNegro = new MenuItem("Negro");

        menuColor.add(itemRojo);
        menuColor.add(itemAzul);
        menuColor.add(itemNegro);

        barra.add(menuEstilo);
        barra.add(menuColor);

        ventana.setMenuBar(barra);

        // Eventos de estilo
        itemNegrita.addActionListener(e ->
            lblTexto.setFont(new Font("Arial", Font.BOLD, 14)));

        itemNormal.addActionListener(e ->
            lblTexto.setFont(new Font("Arial", Font.PLAIN, 14)));

        // Eventos de color
        itemRojo.addActionListener(e ->
            lblTexto.setForeground(Color.RED));

        itemAzul.addActionListener(e ->
            lblTexto.setForeground(Color.BLUE));

        itemNegro.addActionListener(e ->
            lblTexto.setForeground(Color.BLACK));

        // Cerrar ventana
        ventana.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                ventana.dispose();
                System.exit(0);
            }
        });

        ventana.setVisible(true);
    }
}