package Vetores_Matrizes;

import java.util.Random;

public class Vetor4 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random random = new Random();


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
    }
}
