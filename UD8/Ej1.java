package practica;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Ej1 {

    public static void main(String[] args) {


        DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
        DocumentBuilder db = null;
        ArrayList<Alumno> alumnos = new ArrayList<>();
        ArrayList<String> DNI = new ArrayList<>();

        try {
            db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("alumnosPractica.xml"));

            NodeList nl = doc.getElementsByTagName("alumno");

            for (int i = 0; i < nl.getLength() ; i++) {
                String dni = "";
                String nombre = "";
                String apellido = "";
                String direccion = "";

                Element e = (Element) nl.item(i);

                if (e.hasAttributes()){
                    NamedNodeMap nodeMap = e.getAttributes();
                    for (int j = 0; j < nodeMap.getLength() ; j++) {
                        Node node = nodeMap.item(j);
                        Attr atributo = e.getAttributeNode(node.getNodeName());
                        if (atributo.getNodeName().equals("dni")) {
                            dni = atributo.getTextContent();
                        }
                        DNI.add(dni);
                    }
                    Collections.sort(DNI);
                }
                NodeList nl2 = nl.item(i).getChildNodes();
                for (int j = 0; j < nl2.getLength() ; j++) {
                    if (nl2.item(j).getNodeType()==Node.ELEMENT_NODE) {
                        Element tag = (Element) nl2.item(j);
                        if (tag.getTagName().equals("nombre")) {
                            nombre = tag.getTextContent();
                        } else if (tag.getTagName().equals("apellido")){
                            apellido = tag.getTextContent();
                        } else if (tag.getTagName().equals("direccion")){
                            direccion = tag.getTextContent();
                        }
                    }
                }
                alumnos.add(new Alumno(dni,nombre,apellido,direccion));
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        System.out.println(alumnos);
        System.out.println(DNI);
    }
}
