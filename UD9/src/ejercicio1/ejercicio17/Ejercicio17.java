package ejercicio17;
import java.io.File;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;

public class Ejercicio17 {
	public static void main(String[] args) {
		
		try {
			Contactos lista = new Contactos();
			
			lista.getPersonas().add(
                    new Persona("Lucía Gómez", "Calle del Cementerio 12", "600111222"));
			
			lista.getPersonas().add(
                    new Persona("Diego Gozález", "Calle Ronda 24", "633444555"));
			
			lista.getPersonas().add(
                    new Persona("Juan García", "Calle Rodas 17", "666777888"));
			
            // Crear el XML
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document documento = builder.newDocument() ; // Documento en blanco
            // Elemento raíz
            
            Element raiz = documento.createElement("contactos");
            documento.appendChild(raiz);
            for (Persona p : lista.getPersonas()) {

                // <persona>
                Element persona = documento.createElement("persona");

                // <nombre>
                Element nombre = documento.createElement("nombre");
                nombre.setTextContent(p.getNombre());

                // <direccion>
                Element direccion = documento.createElement("direccion");
                direccion.setTextContent(p.getDireccion());

                // <telefono>
                Element telefono = documento.createElement("telefono");
                telefono.setTextContent(p.getTelefono());

                // Añadir elementos a persona
                persona.appendChild(nombre);
                persona.appendChild(direccion);
                persona.appendChild(telefono);

                // Añadir persona a raíz
                raiz.appendChild(persona);
            	
            }


            TransformerFactory transformerFactory = TransformerFactory.newInstance();
            Transformer transformer = transformerFactory.newTransformer();
 
            transformer.setOutputProperty(OutputKeys.INDENT, "yes");
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");

            DOMSource origen = new DOMSource(documento);
            StreamResult destino = new StreamResult(new File("contactos.xml"));


            transformer.transform(origen, destino);

            System.out.println("¡Archivo XML generado con éxito de manera estructurada!");
            
            File file = new File("contactos.xml");


            // 2. Parsear el archivo XML
            documento = builder.parse(file);

            // Opcional pero recomendado: normaliza el árbol XML
            documento.getDocumentElement().normalize();

            // 3. Obtener el elemento raíz (<configuracion>)
            raiz = documento.getDocumentElement();

            System.out.println("Elemento raíz: " + raiz.getNodeName());

            // 4. Obtener los hijos de <base-datos>
            NodeList listaBaseDatos = raiz.getElementsByTagName("persona");

            // Tomamos el primero
            Node nodoBaseDatos = listaBaseDatos.item(0);

            // 5. Ver sus hijos directos
            NodeList hijos = nodoBaseDatos.getChildNodes();

            System.out.println("\nNúmero de hijos detectados: " + hijos.getLength());

            System.out.println("\n--- Listando hijos ---");

            // Mostrar todos los nodos
            for (int i = 0; i < hijos.getLength(); i++) {

                Node hijo = hijos.item(i);

                System.out.println(
                        "Hijo " + i +
                        " -> Tipo: " + hijo.getNodeType() +
                        " | Nombre: " + hijo.getNodeName()
                );
            }
			
		} catch (Exception e) {
			e.printStackTrace();
			
		}
	}

}
