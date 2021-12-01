package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce la longitud del primer vector:");
        int tam1 = sc.nextInt();

        System.out.println("Introduce la longitud del segundo vector:");
        int tam2 = sc.nextInt();

        int[] vector1 = new int[tam1];
        int[] vector2 = new int[tam2];

        System.out.println("Relleno del primer vector: ");
        for (int i = 0; i < vector1.length; i++) {
            System.out.println("Introduzca la cifra de la posición " + i + ":");
            int numero1 = sc.nextInt();
            vector1[i] = numero1;
        }

        System.out.println("Relleno del segundo vector: ");
        for (int i = 0; i < vector2.length; i++) {
            System.out.println("Introduzca la cifra de la posición " + i + ":");
            int numero2 = sc.nextInt();
            vector2[i] = numero2;
        }

        System.out.println("PrimerVector:" + Arrays.toString(vector1));
        System.out.println("SegundoVector:" + Arrays.toString(vector2));
        System.out.println("VectorIntersección:" + Arrays.toString(interseccionVectores(vector1, vector2)));

    }

    public static int[] interseccionVectores(int[] a, int[] b) {
        int[] resultado = new int[0];
        for (int i = 0; i < a.length; i++) {
            if (esta(a[i], b) && !esta(a[i], resultado)) {
                resultado = Arrays.copyOf(resultado, resultado.length + 1);
                resultado[resultado.length - 1] = a[i];
            }
        }
        Arrays.sort(resultado);

        return resultado;
    }

    public static boolean esta(int n, int[] a) {
        for (int i = 0; i < a.length; i++) {
            if (n == a[i]) {
                return true;
            }
        }
        return false;
    }
}