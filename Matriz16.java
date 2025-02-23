package Vetores_Matrizes;

import java.util.Scanner;

public class Matriz16 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o tamanho da matriz identidade: ");
        int tamanho = scanner.nextInt();

        int[][] matrizIdentidade = new int[tamanho][tamanho];

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j) {
                    matrizIdentidade[i][j] = 1;
                } else {
                    matrizIdentidade[i][j] = 0;
                }
            }
        }

        System.out.println("Matriz identidade de tamanho " + tamanho + ":");
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                System.out.print(matrizIdentidade[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();

    }
}
