package com.company;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int numeroReves=0;
        int numeroFinal=0;
        int posiciones=0;

        System.out.println("Introduce un número:");
        num = sc.nextInt();

        do {
            numeroReves = (numeroReves * 10) + (num%10);
            num = num/10;

        }while (num>0);

        do {
            numeroFinal = (numeroFinal * 10) + (numeroReves%10);
            numeroReves = numeroReves/10;

        }while (numeroReves>0);

        System.out.println(numeroFinal);


    }
}
