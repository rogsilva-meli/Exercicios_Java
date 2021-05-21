package com.mercadolivre;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
Desenvolva um programa para mostrar os primeiros n números pares,
sendo n um valor que o usuário irá inserir pelo console.
Lembre-se que um número é par quando divisível por 2.
 */

public class Exercicio1 {
    public static void main(String[] args) {
        List<Integer> lista= new ArrayList<>();
        int a, b;

        Scanner sc = new Scanner(System.in);

        System.out.println("Quantos numeros voce ira informar ?");
        b = sc.nextInt();

        for (int i = 0; i < b; i++) {
            System.out.println("Digite um numero inteiro:");
            a = sc.nextInt();
            if(a % 2 == 0){
                lista.add(a);
            }
        }
        System.out.println(lista);
    }
}
