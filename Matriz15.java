package Vetores_Matrizes;

import java.util.Scanner;

public class Matriz15 {
    public static void main(String[] args) {

        int[][] matriz = new int[3][3];
        int somaDiagonalSecundaria = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite os números para preencher a matriz 3x3:");

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            somaDiagonalSecundaria += matriz[i][2 - i];
        }

        System.out.println("A soma dos elementos da diagonal secundária é: " + somaDiagonalSecundaria);

        scanner.close();
    }
}
