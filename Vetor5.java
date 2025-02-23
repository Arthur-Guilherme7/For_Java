package Vetores_Matrizes;

import java.util.Random;
import java.util.Scanner;

public class Vetor5 {
    public static void main(String[] args) {
        int[] numeros = new int[10];
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
        }


        int maior = numeros[0];
        int menor = numeros[0];


        for (int i = 1; i < numeros.length; i++) {
            if (numeros[i] > maior) {
                maior = numeros[i];
            }
            if (numeros[i] < menor) {
                menor = numeros[i];
            }
        }


        System.out.print("Números gerados: ");
        for (int num : numeros) {
            System.out.print(num + " ");
        }


        System.out.println("Maior número: " + maior);
        System.out.println("Menor número: " + menor);


        System.out.print("Digite um número para verificar se está na lista: ");
        int numeroUsuario = scanner.nextInt();


        boolean encontrado = false;
        for (int num : numeros) {
            if (num == numeroUsuario) {
                encontrado = true;
                break;
            }
        }


        if (encontrado) {
            System.out.println("O número " + numeroUsuario + " está na lista.");
        } else {
            System.out.println("O número " + numeroUsuario + " não está na lista.");
        }


        scanner.close();
    }
}
