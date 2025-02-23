package Vetores_Matrizes;

public class ForEach28 {
    public static void main(String[] args) {

        int[][] matriz = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        int soma = 0;

        for (int[] linha : matriz) {
            for (int elemento : linha) {
                soma += elemento;
            }
        }

        System.out.println("A soma de todos os elementos da matriz 4x4 é: " + soma);
    }
}
