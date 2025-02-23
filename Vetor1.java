package Vetores_Matrizes;

import java.util.Scanner;

public class Vetor1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int vetor[] = new int[5];

        for (int i = 0; i< vetor.length; i++){
            System.out.println("Digite um número: " + (i+1));
            vetor[i] = sc.nextInt();
        }

        System.out.println("Números digitados: ");
        for (int num : vetor){
            System.out.println(num);
        }
        sc.close();
    }
}
