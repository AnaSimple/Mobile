package com.lista2;

import java.util.Scanner;

public class Exercicio1 {
    public static void main (String [] args){
        int numero;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o numero");
        numero = entrada.nextInt();
        int resto;
        resto = numero % 2;
        if(resto == 0){
            System.out.println("par");

        }else {
            System.out.println("ímpar");

        }if(resto > 0){
            System.out.println("Positivo");

        }else System.out.println("negativo");


    }
}
