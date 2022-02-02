package com.company.ejercicioOpositor;

public class Main {

    public static void main(String[] args) {

        Opositor o1 = new Opositor("Joaquín", "Galán Zabala",1970, true,"Buen opositor");
        Opositor o2 = new Opositor("Manuel", "Perez Garcia",1989, false,"Buen opositor");
        Opositor o3 = new Opositor("Alberto", "Jimenez Castro",1990, true,"Buen opositor");
        Opositor o4 = new Opositor("Ivan", "Jimenez Negron",1999, false,"Buen opositor");

        o1.mostrarInformacion();

        Sede sede1 = new Sede("1", Capitales.SEVILLA);

        sede1.addOpositor(o1);
        sede1.addOpositor(o4);


        sede1.mostrarInformacion();

        Examen examen1 = new Examen("mamerta", "galana.com");

        examen1.addSede(sede1);

        examen1.mostrarInformacion();

        examen1.deleteSede();

        examen1.mostrarInformacion();

        Opcion opcion1 = new Opcion("que va", true);
        Opcion opcion2 = new Opcion("si", false);
        Opcion opcion3 = new Opcion("a lo mejor", false);
        Opcion opcion4 = new Opcion("si", true);
        Opcion opcion5 = new Opcion("no", true);
        Opcion opcion6 = new Opcion("puede ser", true);

        Pregunta pregunta1 = new Pregunta("Enunciado1");
        Pregunta pregunta2 = new Pregunta("Enunciado2");

        pregunta1.addOption(opcion1);
        pregunta1.addOption(opcion2);
        pregunta1.addOption(opcion3);
        pregunta2.addOption(opcion4);
        pregunta2.addOption(opcion5);
        pregunta2.addOption(opcion6);

        pregunta1.mostrarInformacion();
        pregunta2.mostrarInformacion();

        Sede sede2 = new Sede("2",Capitales.ALMERIA);

        sede2.addOpositor(o3);
        sede2.addOpositor(o2);
        sede2.mostrarInformacion();


    }
}

