package com.mercadolivre;

import java.util.Arrays;

public class Exercicio9 {
    public static void main(String[] args) {

        int iArr[] = {16223, 898, 13, 906, 235, 23, 9, 1532, 6388, 2511, 8};

        sort(iArr);

        for (int i : iArr) {
            System.out.print(i + " ");
        }
    }

    public static void sort(int numbers[]) {
        int maximumNumber = buscarNumeroMaximo(numbers);
        int numberOfDigits = numeroDigitosEntrada(maximumNumber);
        int placeValue = 1;

        while (numberOfDigits-- > 0) {
            aplicarContagemSort(numbers, placeValue);
            placeValue *= 10;
        }
    }

    private static void aplicarContagemSort(int[] numbers, int placeValue) {
        int range = 10;

        int length = numbers.length;
        int[] frequency = new int[range];
        int[] sortedValues = new int[length];

        for (int i = 0; i < length; i++) {
            int digit = (numbers[i] / placeValue) % range;
            frequency[digit]++;
        }

        for (int i = 1; i < range; i++) {
            frequency[i] += frequency[i - 1];
        }

        for (int i = length - 1; i >= 0; i--) {
            int digit = (numbers[i] / placeValue) % range;
            sortedValues[frequency[digit] - 1] = numbers[i];
            frequency[digit]--;
        }

        System.arraycopy(sortedValues, 0, numbers, 0, length);
    }

    private static int numeroDigitosEntrada(int number) {
        return (int) Math.log10(number) + 1;
    }

    private static int buscarNumeroMaximo(int[] arr) {
        return Arrays.stream(arr).max().getAsInt();
    }

}