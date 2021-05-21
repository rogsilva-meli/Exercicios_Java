package com.mercadolivre;

import java.util.Scanner;

/*
Desenvolva um programa para informar se um um número n é primo ou não,
sendo n um valor que o usuário irá inserir pelo console.
Lembre-se que um número é primo quando só é divisível por 1 e por si mesmo.
 */

public class Exercicio3 {
    public static void main(String[] args) {

        int a;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Informe um número:");
            a = sc.nextInt();
// Falta corrigir
            if (a % 2 == 0 || a % 3 == 0 || a % 2 == 5) {
                System.out.println("O número: " + a + " É primo !");
            } else {
                System.out.println("O número: " + a + " NÃO é primo !");
            }
        }while (a != 0);
    }

}
