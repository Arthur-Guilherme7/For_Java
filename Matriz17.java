package Vetores_Matrizes;

import java.util.Scanner;

public class Matriz17 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os elementos da matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Digite um número escalar: ");
        int escalar = scanner.nextInt();

        System.out.println("Matriz resultante após multiplicação pelo escalar:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matriz[i][j] *= escalar;
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
