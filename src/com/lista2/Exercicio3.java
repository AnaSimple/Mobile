package com.lista2;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String[] args){
        double n1;
        double n2;
        double n3;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite a nota 1");
        n1 = entrada.nextDouble();
        System.out.println("Digite a nota 2");
        n2 = entrada.nextDouble();
        System.out.println("Digite a nota 3");
        n3 = entrada.nextDouble();

        if(n1>n2&&n1>n3){
            System.out.println("A nota maior é " +n1);

        }else if(n2>n1&&n2>n3){
            System.out.println("A nota maior é " +n2);
        }else{
            System.out.print("A nota maior é "+ n3);

        }
        double media;
        media = (n1+n2+n3) / 3;
        System.out.println("Sua media é " + media );

    }
}
