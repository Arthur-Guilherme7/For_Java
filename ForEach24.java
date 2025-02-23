package Vetores_Matrizes;

public class ForEach24 {
    public static void main(String[] args) {

        int[] numeros = {5, 10, 15, 20, 25, 30, 35, 40, 45, 50};

        System.out.println("Números pares da lista:");

        for (int numero : numeros) {
            if (numero % 2 == 0) {
                System.out.println(numero);
            }
        }
    }
}
