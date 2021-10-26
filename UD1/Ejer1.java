package com.company;

import java.util.Scanner;

public class Ejer1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        int numX=0;
        int numEspacios=0;
        System.out.println("Introduce la altura de la Z:");
        altura = sc.nextInt();
        for (int i = 0; i < altura ; i++) {


            for (int j = 0; j < altura ; j++) {
                if (i==0||i==altura-1){
                    System.out.print("*");
                } else {

                        System.out.print("-");

                    }
                }System.out.println();


            }
        }

    }

