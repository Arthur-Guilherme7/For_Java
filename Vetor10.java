package Vetores_Matrizes;

import java.util.Scanner;

public class Vetor10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int[] lista1 = new int[5];
        int[] lista2 = new int[5];
        int[] lista3 = new int[10];

        System.out.println("Digite 5 números para a primeira lista:");
        for (int i = 0; i < lista1.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            lista1[i] = scanner.nextInt();
        }

        System.out.println("Digite 5 números para a segunda lista:");
        for (int i = 0; i < lista2.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            lista2[i] = scanner.nextInt();
        }

        for (int i = 0; i < 5; i++) {
            lista3[i] = lista1[i];
            lista3[i + 5] = lista2[i];
        }

        System.out.print("Lista combinada: ");
        for (int num : lista3) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
