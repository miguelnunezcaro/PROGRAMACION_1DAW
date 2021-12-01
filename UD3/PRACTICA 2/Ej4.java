package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ej4 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el número de filas");
        int fila = sc.nextInt();


        System.out.println("Itroduce el número de columnas");
        int colum = sc.nextInt();


        int[][] vector = new int[fila][colum];


        for (int i = 0; i < vector.length; i++) {
            for (int j = 0; j < vector[i].length; j++) {
                int numAleatorio = (int) (Math.random() * 16);
                vector[i][j] = numAleatorio;
            }
        }
        for (int[] row : vector) {
            System.out.println(Arrays.toString(row));
        }
        System.out.println("Introduce el número de columnas: ");
        int colum2 = sc.nextInt();


        System.out.println("La matriz desplazada es: ");
        for (int[] row : desplazarMatriz(colum2, vector)) {
            System.out.println(Arrays.toString(row));
        }
    }

    public static int[][] desplazarMatriz(int colum2, int[][] num) {
        int[][] result = new int[num.length][num[0].length];
        while (colum2 >= num[0].length) {
            colum2 -= num[0].length;
        }

        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                if (j + colum2 < num[i].length) {
                    result[i][j + colum2] = num[i][j];
                } else {
                    result[i][j + colum2 - num[i].length] = num[i][j];
                }
            }
        }
        return result;
    }
}
