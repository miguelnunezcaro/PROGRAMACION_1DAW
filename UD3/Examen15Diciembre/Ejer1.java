package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int tamaño;
        int tamaño2;

        System.out.println("Introduce el tamaño para el primer vector:");
        tamaño = sc.nextInt();

        System.out.println("Introduce el tamaño para el segundo vector:");
        tamaño2 = sc.nextInt();

        int [] v1 = new int[tamaño];
        int [] v2 = new int[tamaño2];

        System.out.println("Rellena el primer vector:");

        for (int i = 0; i < v1.length ; i++) {
            v1[i] = sc.nextInt();
        }

        System.out.println("Rellena el segundo vector:");

        for (int i = 0; i < v2.length ; i++) {
            v2[i] = sc.nextInt();
        }

        System.out.println(Arrays.toString(v1));
        System.out.println(Arrays.toString(v2));
    }

    public static int[] mediaVectores(int[] vector1, int[] vector2){

        int[] vectorResultado = new int[vector1.length];

        for (int i = 0; i < vector1.length; i++) {

        }

        return vectorResultado;
    }
}
