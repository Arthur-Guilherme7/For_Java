package Vetores_Matrizes;

public class ForEach31 {
    public static void main(String[] args) {

        int[] numeros = {5, -10, 15, -20, 25, -30};

        System.out.println("Lista antes de substituir os negativos por zero:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }

        // Substituindo os valores negativos por zero
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] < 0) {
                numeros[i] = 0;
            }
        }

        System.out.println("\n\nLista após substituir os negativos por zero:");

        for (int numero : numeros) {
            System.out.print(numero + " ");
        }
    }
}
