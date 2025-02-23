package Vetores_Matrizes;

import java.util.Random;

public class Vetor6 {
    public static void main(String[] args) {

        int[] numeros = new int[10];
        Random random = new Random();


        System.out.print("Vetor original: ");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = random.nextInt(100) + 1;
            System.out.print(numeros[i] + " ");
        }


        int countPares = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                countPares++;
            }
        }


        int[] numerosPares = new int[countPares];
        int index = 0;
        for (int num : numeros) {
            if (num % 2 == 0) {
                numerosPares[index++] = num;
            }
        }


        System.out.print("Vetor após remover ímpares: ");
        for (int num : numerosPares) {
            System.out.print(num + " ");
        }
    }
}
