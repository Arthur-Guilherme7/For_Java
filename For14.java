package Exercícios_For;

import java.util.Scanner;

public class For14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        System.out.println("Entre com um numero ");
        int num = sc.nextInt();
        for(int i = 2; i <= num; i++) {
            boolean primo = true;
            for(int j = 2; j < i; j++) {
                if(i % j == 0) {
                    primo = false;
                }
            }
            if(primo) {
                System.out.println(i);
            }
        }
    }
}

