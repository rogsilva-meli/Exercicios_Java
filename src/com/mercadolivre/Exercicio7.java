package com.mercadolivre;

import java.text.DecimalFormat;

/*
Em 2021 uma startup de tecnologia, denominada de “Empresa X” é avaliada em 1,13 milhão e possui uma média de
crescimento anual de 148%, uma concorrente do ramo, “Empresa Y”, é avaliada em 18,4 milhões e com sua média de
crescimento anual em 32%.
    Empresa X - 01/01/2021 - Valor da empresa: 1,13m
    Empresa Y - 01/01/2021 - Valor da empresa: 18,4m
Considerando este cenário, imprima no console (conforme formatação acima) a evolução anual até que a
empresa X ultrapasse a empresa Y em seu valor de empresa.
 */
public class Exercicio7 {
    public static void main(String[] args) {
        double valorX = 1.13;
        double valorY = 18.4;
        double crescimentoX = 1.48;
        double crescimentoY = 0.32;
        int cont = 0;

        DecimalFormat formato = new DecimalFormat("#,###,##");

        for(int i = 0; valorY > valorX; i++){
            cont++;
            System.out.println("Empresa X - 01/01/202" + i + "- Valor da empresa: " + String.format("%2f",valorX) + "m");
            System.out.println("Empresa Y - 01/01/202" + i + "- Valor da empresa: " + String.format("%2f",valorY) + "m");
            valorX += valorX * crescimentoX;
            valorY += valorY * crescimentoY;
        }
        System.out.println(cont+" anos");
    }
}
