package com.company;

import java.util.Scanner;

public class Ejercicio4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double altura;
        double anchura;
        double precioBanderainicial;
        double precioBanderafinal;
        double gastosEnvios = 3.25;
        double total = 0;
        String EscudoBordado;
        System.out.println("Introduzca la altura de la bandera en cm:");
        altura = sc.nextInt();
        System.out.println("Introduzca la anchura de la bandera en cm:");
        anchura = sc.nextInt();
        double dimensionBandera = (altura * anchura);
        precioBanderainicial = (altura * anchura) / 100;
        sc.nextLine();
        System.out.println("¿Tiene escudo bordado?");
        EscudoBordado = sc.nextLine();
        if (EscudoBordado.equals("si")) {
            precioBanderafinal = precioBanderainicial + 2.50;
        } else {
            precioBanderafinal = precioBanderainicial;

        }
        total = precioBanderafinal + gastosEnvios;


        System.out.println("Gracias. Aquí tiene el desglose de su compra.");
        System.out.println("Bandera de " + dimensionBandera + " cm2: " + precioBanderainicial + "€");
        if (EscudoBordado.equals("si")) {
            System.out.println("Con escudo: 2.5€");
        } else {
            System.out.println("Sin escudo: 0.0€");
        }
        System.out.println("Gastos de envío: " + gastosEnvios + "€");
        System.out.println("Total: " + total + "€");

    }
}
