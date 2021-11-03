package com.company;

import java.util.Scanner;

public class Ejercicio1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int altura;
        int anchura;

        do {
            System.out.println("Por favor, introduzca la altura del árbol:");
            altura = sc.nextInt();
        }while (altura<4);

        anchura = altura + 2;
        for (int i = 0; i < altura ; i++) {
            for (int j = 0; j < anchura; j++) {
                if (i==0 && j==anchura/2){
                    System.out.print("*");
                } else if (i==altura-1 && j==anchura/2){
                    System.out.print("Y");
                } else if (i+j==5 && (i!=altura-1) || (i==altura-2) || (i+j==11 && i!=altura-4 && i!=altura-1 ) || (j==8 && i==altura-3 ) ){
                    System.out.print("+");
                } else {
                    System.out.print("-");
                }
            }System.out.println();
        }

    }
}
