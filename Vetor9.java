package Vetores_Matrizes;

import java.util.Scanner;

public class Vetor9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Parte 1: Lista de 7 elementos exibida na ordem inversa
        int[] lista7 = new int[7];

        System.out.println("Digite 7 números:");
        for (int i = 0; i < lista7.length; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            lista7[i] = scanner.nextInt();
        }

        System.out.print("Lista na ordem inversa: ");
        for (int i = lista7.length - 1; i >= 0; i--) {
            System.out.print(lista7[i] + " ");
        }

        System.out.println("\n");
    }
}
