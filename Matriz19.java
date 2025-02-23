package Vetores_Matrizes;

import java.util.Scanner;

public class Matriz19 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int[][] matrizTransposta = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        // Calculando a matriz transposta
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizTransposta[i][j] = matriz[j][i];
            }
        }

        System.out.println("Matriz original:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matriz transposta:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrizTransposta[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
