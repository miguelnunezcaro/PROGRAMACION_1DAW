package com.company;

import java.util.Arrays;

public class Ejer2 {

    public static void main(String[] args) {
        int[] v1 = {1,2,3,4,5};

        System.out.println(Arrays.toString(v1));

        v1 = insertarValor(v1, 8, 3);

        System.out.println(Arrays.toString(v1));


        for (int i = 0; i < v1.length; i++) {
            System.out.print(v1[i] + " ");
        }

    }

    public static int[] insertarValor(int[] v, int dato, int pos) {

        int[] result = new int[v.length + 1];

        for (int i = 0; i < v.length; i++) {
            if (i < pos) {
                result[i] = v[i];
            } else {
                result[i + 1] = v[i];
            }
        }

        result[pos] = dato;

        return result;
    }
}