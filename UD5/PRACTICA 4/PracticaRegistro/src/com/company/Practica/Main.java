package com.company.Practica;

import java.util.Arrays;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        Persona persona1 = new Persona("6547", "Mamerto", "Gonzalez");
        Persona persona2 = new Persona("7454", "Maria", "Zabala");
        Persona persona3 = new Persona("2145", "Mari Carmen", "Perez");
        Persona persona4 = new Persona("3562", "Laura", "Galan");

        System.out.println(persona1);
        System.out.println(persona2);
        System.out.println(persona3);
        System.out.println(persona4);

        Vivienda vivienda1 = new Vivienda(2018, "Paradise", 3, 3, 5, 3, 500000.0);
        vivienda1.addPersona(persona1);
        vivienda1.addPersona(persona1);
        vivienda1.addPersona(persona2);
        vivienda1.addPersona(persona3);
        vivienda1.addPersona(persona4);
        System.out.println(vivienda1);

        vivienda1.mostrarPropiedad();

        LocalComercial localComercial = new LocalComercial(2014, "Las Tortillas", 1, 54000.0, "deporte");
        LocalIndustrial localIndustrial = new LocalIndustrial(2014, "Las Tortillas", 2, 540000.0, 660);
        localComercial.mostrarPropiedad();
        localIndustrial.mostrarPropiedad();

        vivienda1.mostrarPrecioVenta();
        localComercial.mostrarPrecioVenta();
        localIndustrial.mostrarPrecioVenta();

        EquipamientoServicio equipamientoServicio = new EquipamientoServicio(2000, "Ave Fenix", 8, TipoServicio.DEPORTIVO);
        equipamientoServicio.mostrarPropiedad();

        LocalComercial localComercial2 = new LocalComercial(2022, "Las Jirafas", 900, 84000.0, "musica");


        Registro registro1 = new Registro();
        registro1.addPropiedad(vivienda1);
        registro1.addPropiedad(localComercial);
        registro1.addPropiedad(localIndustrial);
        registro1.deletePropiedad(localComercial2);


//        Propiedad[] propiedades = {vivienda1, localComercial, localComercial2, localIndustrial};

//        Arrays.sort(propiedades);
//        System.out.println(Arrays.toString(propiedades));

        registro1.informeSuperficie();
        registro1.informeAntiguedad();




    }
}
