package Vetores_Matrizes;

import java.util.Scanner;

public class Vetor3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numeros = new int[6];
        int soma = 0;

        System.out.println("Digite 6 números:");

        for (int i = 0; i < numeros.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            numeros[i] = scanner.nextInt();
            soma += numeros[i];
        }

        scanner.close();

        int media = soma / numeros.length;

        System.out.print("Os números digitados foram: ");
        for (double num : numeros) {
            System.out.print(num + " ");
        }

        System.out.println("A média dos números é: " + media);
    }
}