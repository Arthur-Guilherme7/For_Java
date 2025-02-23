package Vetores_Matrizes;

import java.util.Scanner;
import java.util.Arrays;
public class Vetor8 {
    public static void main(String[] args) {

        String[] nomes = new String[5];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite 5 nomes:");

        for (int i = 0; i < nomes.length; i++) {
            System.out.print("Nome " + (i + 1) + ": ");
            nomes[i] = scanner.nextLine();
        }

        Arrays.sort(nomes);

        System.out.println("Nomes em ordem alfabética:");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        scanner.close();
    }
}
