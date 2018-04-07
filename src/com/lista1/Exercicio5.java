package com.lista1;

import java.util.Scanner;

public class Exercicio5 {
    public static void main (String [] args){
        int a;
        Scanner entrada;
        entrada = new Scanner (System.in);
        System.out.println("Digite um numero inteiro ");
        a = entrada.nextInt();

        int r;
        r = a * a;

        System.out.println("O resultado é " + r);


    }
}
