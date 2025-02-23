package Vetores_Matrizes;

import java.util.Scanner;

public class ForEach23 {
    public static void main(String[] args) {
        int[] numeros = {5, 10, 15, 20, 25};
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um valor para multiplicar: ");
        int valorMultiplicador = scanner.nextInt();

        System.out.println("Lista após multiplicação:");

        for (int numero : numeros) {
            System.out.println(numero * valorMultiplicador);
        }

        scanner.close();
    }
}
