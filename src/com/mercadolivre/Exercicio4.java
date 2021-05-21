package com.mercadolivre;

import java.util.Scanner;

/*
Desenvolva um programa para mostrar por console os primeiros n números primos,
sendo um valor que o usuário irá inserir pelo console.
 */

public class Exercicio4 {
    public static void main(String[] args) {

        int a, b, primo = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade incial de numeros:");
        a = sc.nextInt();

        System.out.println("Informe a quantidade final de numeros:");
        b = sc.nextInt();

        for (int i = a; i < b; i++) {
            for (int j = 1; j <= i; j++) {
                if(i % j == 0){
                    primo++;
                }
            }
            if(primo == 2){
                System.out.println("O número: "+i+" é primo");
            }
            primo = 0;
        }


    }
}
