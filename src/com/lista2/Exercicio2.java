package com.lista2;

import java.util.Scanner;

public class Exercicio2 {
    public static void main (String [] args){
        int l1;
        int l2;
        int l3;
        Scanner entrada;
        entrada = new Scanner(System.in);
        System.out.println("Digite o lado 1 do triangulo");
        l1 = entrada.nextInt();
        System.out.println("Digite o lado 2 do triangulo");
        l2 = entrada.nextInt();
        System.out.println("Digite o lado 3 do triangulo");
        l3 = entrada.nextInt();

        if(l1+l2>l3&&l2+l3>l1&&l3+l1>l2){
            if(l1==l2&&l2==l3){
                System.out.println("Seu triangulo é equilatero ");
            } else if(l1==l2 || l2==l3 || l1==l3){
                System.out.print("Seu triangulo é isosseles");

            } else {
                System.out.println("Seu triangulo é  escaleno");

            }

        }else{
            System.out.println("Seu triangulo não é um triangulo");
        }


    }
}
