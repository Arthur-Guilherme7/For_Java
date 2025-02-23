package Vetores_Matrizes;

import java.util.Scanner;

public class Vetor2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[5];
        int soma = 0;
        System.out.println("Digite 5 números:");

        for (int i = 0; i < 5; i++) {
            System.out.print("Número " + (i + 1) + ": ");
            vetor[i] = sc.nextInt();
            soma += vetor[i];
        }

        sc.close();

        System.out.println("Os números digitados foram: " );
        for (int num : vetor){
            System.out.println(num);
        }
        System.out.println("A soma dos números é: " + soma);
    }
}
