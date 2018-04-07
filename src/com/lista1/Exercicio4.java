package com.lista1;

import java.util.Scanner;

public class Exercicio4 {
    public static void main (String [] args ){
        double a;
        double b;
        double c;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite a");
        a = entrada.nextDouble();
        System.out.println("Digite b");
        b = entrada.nextDouble();
        c = a;

        a = b;
        b = c;

        System.out.println("O valor de a agora é " + a + " O valor de b agora é " + b );


    }
}
