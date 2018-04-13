package com.lista2;


import java.util.Scanner;

public class Exercicio4 {
    public static void main (String[]args){
        Scanner ler = new Scanner (System.in);
        int x, y, z;
        System.out.println("Digite o primeiro número");
        x = ler.nextInt();

        System.out.println("Digite o segundo número");
        y = ler.nextInt();

        System.out.println("Digite o terceiro número");
        z = ler.nextInt();

        if(x >y ){
            if(y > z){
                System.out.println(x+ "-"+y+"-"+z);

            } else if(x > z){
                System.out.println();
            }

        }





    }
}