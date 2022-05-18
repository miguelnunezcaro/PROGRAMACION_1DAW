package practica;

import estudiarStax.Pedido;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class RecorridoStax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Pedido> pedidos = new ArrayList<>();
        Alumno alumnoActual = null;
        String tagActual = "";
        Integer contadorAlumnos = 0;

        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("alumnosPractica.xml"));

            while (xmlReader.hasNext()){

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {

                    StartElement startTag = xmlEvent.asStartElement();

                    System.out.print("<"+ startTag.getName().getLocalPart());

                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName) {
                        case "alumno" :

                            alumnoActual = new Alumno();
                            tagActual = "alumno";

                            Attribute dni = startTag.getAttributeByName(new QName("dni"));

                            alumnoActual.setDni(dni.getValue());

                            System.out.print(" "+dni.getName()+"=\""+dni.getValue()+"\"");

                            break;

                        case "nombre" :
                            tagActual = "nombre";
                            break;

                        case "apellido" :
                            tagActual = "apellido";
                            break;

                        case "direccion" :
                            tagActual = "direccion";
                            break;
                    }

                    System.out.print(">");

                } else if (xmlEvent.isEndElement()) {

                    EndElement endtag = xmlEvent.asEndElement();
                    System.out.println("<\\" + endtag.getName().getLocalPart()+">");

                    if (endtag.getName().getLocalPart().equals("alumno")) {
                        contadorAlumnos++;
                    }
                    tagActual = "";

                }else if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (!texto.getData().contains("\n")) {
                        System.out.print(texto.getData());
                    }

                    if (!tagActual.equals("")) {
                        switch (tagActual) {
                            case "nombre" :
                                alumnoActual.setNombre(texto.getData());
                                break;
                            case "apellido" :
                                alumnoActual.setApellido(texto.getData());
                                break;
                            case "direccion" :
                                alumnoActual.setDireccion(texto.getData());
                                break;
                        }
                    }
                }


            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hay "+contadorAlumnos+" alumnos.");


    }
}
