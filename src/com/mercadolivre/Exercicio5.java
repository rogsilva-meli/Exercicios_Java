package com.mercadolivre;

import java.util.*;

/*
Desenvolver um programa para exibição por console os n primeiros números naturais
que têm pelo menos de m dígitos de d, sendo n, m e d valores que o utilizador vai entrar pela consola.
Por exemplo: se o usuário inserir n = 5, m = 2 e d = 3, o programa deve exibir
os primeiros 5 números naturais que tenham pelo menos 2 dígitos 3 no console.
Neste caso, a saída será: 33, 133 , 233, 303, 313.
*/

public class Exercicio5 {
        public static void main(String[] args) {

            List<Integer> lista = new ArrayList<>();

            Scanner entrada = new Scanner(System.in);
            int n = 5, m = 2, d = 3;

            System.out.print("Digite o N:");
            n = entrada.nextInt();

            System.out.print("Digite o M:");
            m = entrada.nextInt();

            System.out.print("Digite o D:");
            d = entrada.nextInt();

            // Falta fazer


        }
}
