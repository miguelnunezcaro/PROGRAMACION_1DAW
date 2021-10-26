package com.company;

import java.util.Scanner;

public class Ejer2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        int cifra;
        int numerofinal=0;
        int ocurrecias=0;
        System.out.println("Introduce un número positivo:");
        numero = sc.nextInt();
        System.out.println("Introduce un número del 0 al 9, puedes incluir ambos:");
        cifra = sc.nextInt();
        for (int i = 0; i <numero ; i++) {
            numerofinal = (numerofinal*10) + (numero%10);
            numero/=10;

            if (numerofinal==cifra);
            ocurrecias++;
            System.out.println(ocurrecias);
        }
    }
}
