package com.company;

public class Main {

    public static void main(String[] args) {

        Chirigota chirigota1 = new Chirigota("Los Conejos", "Bad Bunny",
                "Shakespeare", "Gustavo", "Rockero", 10, 100);

        chirigota1.cantar_la_presentacion();
        chirigota1.hacer_tipo();

        Integrante integrante1 = new Integrante(1,
                "Mamerto", 48, "Castilleja de la Cuesta");
        Integrante integrante2 = new Integrante(2,
                "Miguel", 18, "Castilleja de la Cuesta");
        Comparsa comparsa1 = new Comparsa("Manuel", "Pepe", "Manolo","Pablo","Reggaerton","Atos",500);


        chirigota1.insertar_integrante(integrante1);
        chirigota1.insertar_integrante(integrante1);
        chirigota1.insertar_integrante(integrante2);
        chirigota1.eliminar_integrante(integrante1);
        chirigota1.eliminar_integrante(integrante1);

        System.out.println(chirigota1);
        chirigota1.caminito_del_falla();
        chirigota1.amo_a_escucha();

        COAC coac1 = new COAC();
        coac1.inscribir_agrupacion(chirigota1);
        coac1.eliminar_agrupacion(chirigota1);
        System.out.println(coac1);
    }
}
