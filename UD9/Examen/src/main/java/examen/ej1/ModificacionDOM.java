package examen.ej1;

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
import java.util.Arrays;

public class ModificacionDOM {

    public static void main(String[] args) {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("examen1.xml"));

            NodeList nl = doc.getElementsByTagName("plato");

            for (int i = 0; i < nl.getLength() ; i++) {
                Element disponible1 = doc.createElement("disponible");
                disponible1.setTextContent("si");
                nl.item(i).appendChild(disponible1);
            }

            Node root = doc.getDocumentElement();
            Text saltoLinea = doc.createTextNode("\n");


            Element plato = doc.createElement("plato");
            plato.setAttribute("calorias","500");

            Element nombre = doc.createElement("nombre");
            nombre.setTextContent("Cachopo");

            Element precio = doc.createElement("precio");
            precio.setTextContent("15.00");

            Element disponible1 = doc.createElement("disponible");
            disponible1.setTextContent("si");

            plato.appendChild(nombre);
//            plato.appendChild(saltoLinea);
            plato.appendChild(precio);
//            plato.appendChild(saltoLinea);
            plato.appendChild(disponible1);


            root.appendChild(plato);

            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer transformer = tf.newTransformer();

            transformer.setOutputProperty( OutputKeys.INDENT, "yes" );
            transformer.setOutputProperty("{http://xml.apache.org/xslt}indent-amount", "4");
            transformer.setOutputProperty( OutputKeys.OMIT_XML_DECLARATION, "no" );
            transformer.setOutputProperty( OutputKeys.METHOD, "xml" );
            transformer.setOutputProperty("http://www.oracle.com/xml/is-standalone", "yes");

            DOMSource origenDOM = new DOMSource(root);

            File nuevoExamen2 = new File("examen2.xml");
            StreamResult destino = new StreamResult(nuevoExamen2);

            transformer.transform(origenDOM,destino);

        } catch (ParserConfigurationException | IOException | SAXException | TransformerException e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
}