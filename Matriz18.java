package Vetores_Matrizes;

import java.util.Random;

public class Matriz18 {
    public static void main(String[] args) {

        int[][] matriz = new int[4][4];
        int soma = 0;
        int totalElementos = 4 * 4;
        Random random = new Random();


        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                matriz[i][j] = random.nextInt(100) + 1;
                soma += matriz[i][j];
            }
        }


        double media = (double) soma / totalElementos;

        System.out.println("Matriz 4x4:");
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Média de todos os elementos: " + media);
    }
}

