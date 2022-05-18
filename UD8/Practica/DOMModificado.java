package practica;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;

public class DOMModificado {

    public static void main(String[] args) {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("alumnosPractica.xml"));

            NodeList nl = doc.getElementsByTagName("alumno");

            for (int i = 0; i < nl.getLength() ; i++) {
                Element instituto1 = doc.createElement("instituto");
                instituto1.setTextContent("IES ALIXAR");
                nl.item(i).appendChild(instituto1);
            }

            Node root = doc.getDocumentElement();
            Text saltoLinea = doc.createTextNode("\n");


            Element alumno = doc.createElement("alumno");
            alumno.setAttribute("dni","8888888X");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Luis");

            Element apellido = doc.createElement("apellido");
            apellido.setTextContent("Ruiz");

            Element direccion = doc.createElement("direccion");
            direccion.setTextContent("Allí");

            Element instituto2 = doc.createElement("instituto");
            instituto2.setTextContent("IES ALIXAR");

            alumno.appendChild(nombre);
            alumno.appendChild(saltoLinea);
            alumno.appendChild(apellido);
            alumno.appendChild(saltoLinea);
            alumno.appendChild(direccion);
            alumno.appendChild(saltoLinea);
            alumno.appendChild(instituto2);


            root.appendChild(alumno);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoPersonas = new File("alumnos_modificado.xml");
            StreamResult destino = new StreamResult(nuevoPersonas);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
