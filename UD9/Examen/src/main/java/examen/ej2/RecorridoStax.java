package examen.ej2;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;



public class RecorridoStax {
    public static void main(String[] args) {
        Plato platoActual = null;
        String tagActual = "";
        Integer contadorPlatos = 0;

        try {

            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("examen1.xml"));

            while (xmlReader.hasNext()){

                XMLEvent xmlEvent = xmlReader.nextEvent();

                if (xmlEvent.isStartElement()) {

                    StartElement startTag = xmlEvent.asStartElement();

                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName) {
                        case "plato" :

                            platoActual = new Plato();
                            tagActual = "plato";

                            Attribute calorias = startTag.getAttributeByName(new QName("calorias"));

                            platoActual.setCalorias(Integer.valueOf(calorias.getValue()));

                            break;

                        case "nombre" :
                            tagActual = "nombre";
                            break;

                        case "precio" :
                            tagActual = "precio";
                            break;
                    }


                } else if (xmlEvent.isEndElement()) {

                    EndElement endTag = xmlEvent.asEndElement();


                    if (endTag.getName().getLocalPart().equals("plato")) {
                        contadorPlatos++;
                    }
                    tagActual = "";

                }else if (xmlEvent.isCharacters()) {

                    Characters texto = xmlEvent.asCharacters();

                    if (!texto.getData().contains("\n")) {
//                        System.out.print(texto.getData());
                    }

                    if (!tagActual.equals("")) {
                        switch (tagActual) {
                            case "nombre" :
                                platoActual.setNombre(texto.getData());
                                break;
                            case "precio" :
                                platoActual.setPrecio(Double.valueOf(texto.getData()));
                                break;
                        }
                    }
                }
            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("La carta contiene el número de: "+contadorPlatos+" platos.");
    }
}
