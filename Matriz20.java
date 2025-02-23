package Vetores_Matrizes;

import java.util.Scanner;

public class Matriz20 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int somaLinha, somaColuna;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 4x4:");

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.println("\nSoma de cada linha:");
        for (int i = 0; i < 4; i++) {
            somaLinha = 0;
            for (int j = 0; j < 4; j++) {
                somaLinha += matriz[i][j];
            }
            System.out.println("Soma da linha " + (i + 1) + ": " + somaLinha);
        }

        System.out.println("\nSoma de cada coluna:");
        for (int j = 0; j < 4; j++) {
            somaColuna = 0;
            for (int i = 0; i < 4; i++) {
                somaColuna += matriz[i][j];
            }
            System.out.println("Soma da coluna " + (j + 1) + ": " + somaColuna);
        }

        scanner.close();
    }
}
