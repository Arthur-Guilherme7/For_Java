package Ternaria;

import java.util.Scanner;

public class Ternaria10 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um caractere: ");
        char c = scanner.next().toLowerCase().charAt(0);

        String resultado = (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') ? "Vogal" : "Consoante";

        System.out.println(resultado);

        scanner.close();
    }

}
