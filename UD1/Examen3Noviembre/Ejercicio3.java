package com.company;

public class Ejercicio3 {

    public static void main(String[] args) {
        int randomPalos = (int) (Math.random() * 4);
        int randomCarta = (int) (Math.random() * 13);


        if (randomPalos == 0) {
            System.out.println("Palo - picas");
        } else if (randomPalos == 1) {
            System.out.println("Palo - corazones");
        } else if (randomPalos == 2) {
            System.out.println("Palo - diamantes");
        } else if (randomPalos == 3) {
            System.out.println("Palo - tréboles");
        }


        if (randomCarta == 0) {
            System.out.println("Carta: A");
        } else if (randomCarta == 10) {
            System.out.println("Carta: J");
        } else if (randomCarta == 11) {
            System.out.println("Carta: Q");
        } else if (randomCarta == 12) {
            System.out.println("Carta: K");
        } else if (randomCarta == 1) {
            System.out.println("Carta: 2");
        } else if (randomCarta == 2) {
            System.out.println("Carta: 3");
        } else if (randomCarta == 3) {
            System.out.println("Carta: 4");
        } else if (randomCarta == 4) {
            System.out.println("Carta: 5");
        } else if (randomCarta == 5) {
            System.out.println("Carta: 6");
        } else if (randomCarta == 6) {
            System.out.println("Carta: 7");
        } else if (randomCarta == 7) {
            System.out.println("Carta: 8");
        } else if (randomCarta == 8) {
            System.out.println("Carta: 9");
        } else if (randomCarta == 9) {
            System.out.println("Carta: 10");
        }




    }
}
