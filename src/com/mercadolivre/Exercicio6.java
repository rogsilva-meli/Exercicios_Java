package com.mercadolivre;

/*
Exercício 1: Dado um vetor de 10 posições, sendo respectivamente ocupado pelos
valores 52, 10, 85, 1324, 01, 13, 62, 30, 12 e 127.
Imprima no console:
a) Sua ordenação crescente.
b) Sua ordenação decrescente.
 */

import java.util.Arrays;
import java.util.Collections;

public class Exercicio6 {
    public static void main(String[] args) {

        Integer[] array = {52, 10, 85, 1324, 01, 13, 62, 30, 12, 127};

        System.out.println("Ordem crescente: ");
        Arrays.sort(array);
        for (int num: array){
            System.out.println(num);
        }

        System.out.println("Ordem decrescente: ");
        Arrays.sort(array, Collections.reverseOrder());
        for (int num: array){
            System.out.println(num);
        }
    }
}
