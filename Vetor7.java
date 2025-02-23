package Vetores_Matrizes;

import java.util.Scanner;
import java.util.Arrays;
public class Vetor7 {

        public static void main(String[] args){
            int[] numeros = new int[8];
            Scanner scanner = new Scanner(System.in);

            System.out.println("Digite 8 números:");

            for (int i = 0; i < numeros.length; i++) {
                System.out.print("Número " + (i + 1) + ": ");
                numeros[i] = scanner.nextInt();
            }

            Arrays.sort(numeros);

            System.out.print("Números em ordem crescente: ");
            for (int num : numeros) {
                System.out.print(num + " ");
            }

            scanner.close();
        }
    }
