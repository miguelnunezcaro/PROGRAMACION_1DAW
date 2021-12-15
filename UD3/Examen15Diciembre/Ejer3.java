package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Ejer3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;

        System.out.println("Elija la dimensión de la matriz:");
        num = sc.nextInt();

        int[][] matriz = new int[num][num];

        for (int i = 0; i < matriz.length ; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int)(Math.random()*(200-100)+100);
            }
        }

        for (int[] row:matriz
        ) {
            System.out.println(Arrays.toString(row));
        }

    }
}
