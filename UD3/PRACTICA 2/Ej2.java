package com.company;

import javax.swing.*;
import java.util.Arrays;

public class Ej2 {

    public static void main(String[] args) {

        int[] num = new int[20];
        int[] cuadrado = new int[20];
        int[] cubo = new int[20];




        for (int i = 0; i < num.length ; i++) {
            int numAleatorio = (int)(Math.random()*101);
            num[i] = numAleatorio;
        }

        for (int i = 0; i < cuadrado.length ; i++) {
            cuadrado[i]=num[i]*num[i];
        }

        for (int i = 0; i < cubo.length ; i++) {
            cubo[i]=num[i]*num[i]*num[i];
        }


        for (int i = 0; i < num.length ; i++) {
            System.out.print(num[i]+"-");
            System.out.print(cuadrado[i]+"-");
            System.out.print(cubo[i]+" ");
            System.out.println();
        }
    }
}

