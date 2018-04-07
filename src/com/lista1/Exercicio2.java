package com.lista1;

import java.util.Scanner;

public class Exercicio2 {
    public static void main ( String [] args){
        double C;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Digite os graus");
        C = entrada.nextDouble();
        double R;
        R =  (9 * C + 160) / 5;

        System.out.println("O grau convertido é " + R);

    }
}
