package com.mercadolivre;

import java.util.ArrayList;
import java.util.Scanner;

/*
Para um protótipo de supermercado, crie um programa que leia 3 produtos e imprima no console:
nome, preço, quantidade e o valor total da compra.
Produto: 1          Produto: 2              Produto: 3
Arroz               Feijão                  Tomate
R$ 10,99            R$ 14,49                R$ 9,99
Quantidade: 2       Quantidade: 1           Quantidade: 5

Valor Total: R$ 86,42
 */
public class Exercicio8 {
    public static void main(String[] args) {

        ArrayList<Produto> produtos = new ArrayList();

        int cont = 1;

        double total = 0;

        Scanner entrada = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            Produto produto = new Produto();

            produto.codigo = cont++;

            System.out.println("Informe o nome do produto: ");
            produto.nome = entrada.next();

            System.out.println("Informe o preço do produto: ");
            produto.preco = entrada.nextDouble();

            System.out.println("Informe a quantidade do produto: ");
            produto.qtd = entrada.nextInt();

            produtos.add(produto);
            total += produto.preco * produto.qtd;
        }

        System.out.println(produtos);
        System.out.println("Valor Total: R$ "+total);
    }

    static class Produto {
        int codigo;
        String nome;
        double preco;
        int qtd;

        @Override
        public String toString() {
            return "Produto: " + codigo + "\n"+
                    nome + '\n' +
                    "Preço: " + preco + '\n' +
                    "Quantidade: "+ qtd + "\n----------------\n";
        }
    }
}
