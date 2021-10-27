package com.company;

import java.util.Scanner;

public class Ejer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float entradas;
        float entradaBase = 8;
        String diaSemana;
        String tarjetaCine;
        float entradasfinal = 0;
        float precio = 0;
        float descuento = 0;
        float preciofinal = 0;

        System.out.println("¿Cuantas entradas tienes?");
        entradas = sc.nextFloat();
        sc.nextLine();
        System.out.println("¿Que día vas?");
        diaSemana = sc.nextLine();
        System.out.println("¿Tiene tarjeta CineCampa?");
        tarjetaCine = sc.nextLine();
        if (diaSemana.equals("Miercoles")) {
            precio = entradas * 5;
            preciofinal=precio;
        }else if (diaSemana.equals("Jueves")) {
               if (entradas % 2 == 0) {
                    entradasfinal = entradas / 2;
                    precio = entradasfinal * 11;}
                    else {
                   entradasfinal = entradas / 2;

                   entradas = entradas - (entradasfinal * 2);
                    entradas = entradas * 8;
                    precio = precio + entradas;}
                    preciofinal = precio;
                }
                if (tarjetaCine.equals("Si")) {
                    descuento = (precio * 10) / 100;
                    preciofinal = precio - descuento;
                }
        System.out.println("Precio entrada individual: " + entradaBase + " €");
        System.out.println("Descuento: " + descuento + " €");
        System.out.println("A pagar: " + preciofinal + "€");
            }


        }




