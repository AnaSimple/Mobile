package com.lista1;

import java.util.Scanner;

public class Exercicio1 {

    public static void main(String[] args) {
        double a;
        double b;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nunero 1");
        a = entrada.nextDouble();

        System.out.println("Digite o nunero 2");
        b = entrada.nextDouble();

        double soma = a+b;
        double diferenca = a-b;
        double produto = a*b;
        double media = (a+b)/2;

        System.out.println("A soma é " + soma);
        System.out.println("A diferença é " + diferenca);
        System.out.println("O produto é " + produto);
        System.out.println("A médiaé " + media);



    }
}
