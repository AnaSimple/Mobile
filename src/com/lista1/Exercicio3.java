package com.lista1;

import java.util.Scanner;

public class Exercicio3 {
    public static void main (String [] args){
        double Raio;
        double Altura;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o raio");
        Raio = entrada.nextDouble();
        System.out.println("Digite o altura");
        Altura = entrada.nextDouble();
        double volume;
        volume = 3.14 * (Raio * Raio) * Altura;

        System.out.println("O volume é " + volume);




    }
}
