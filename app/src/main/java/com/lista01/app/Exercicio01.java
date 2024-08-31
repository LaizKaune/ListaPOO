package com.lista01.app;

import java.util.Scanner;

//1) Escreva um programa que faça a soma entre 2 números.
public class Exercicio01 {
    public static void resultado (){
        double n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite o primeiro número: ");
        n1 = sc.nextDouble();
        System.out.print("Digite o segundo número: ");
        n2 = sc.nextDouble();
        double soma = n1 + n2;
        System.out.print("A soma é: "+soma); 
    }


}
