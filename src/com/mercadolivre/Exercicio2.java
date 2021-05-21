package com.mercadolivre;

import java.util.Scanner;

/*
Desenvolva um programa para mostrar os primeiros n números múltiplos de m,
sendo n e m valores que o usuário irá inserir via console.
Lembre-se que um número a é divisível por b se a é divisível por b.
 */

public class Exercicio2 {
    public static void main(String[] args) {

        int n, m;

        Scanner sc = new Scanner(System.in);

        System.out.println("Informe a quantidade de numeros:");
        m = sc.nextInt();

        System.out.println("Informe o numero multiplo: ");
        n = sc.nextInt();

        for (int i = 1; i <= m; i++) {
            // verifica se o resto da divisao por três é zero
            if ((i % n) == 0) {
                // Imprime o valor na tela
                System.out.println(i);
            }
        }
    }
}
