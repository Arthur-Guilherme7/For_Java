package Vetores_Matrizes;

public class ForEach22 {
    public static void main(String[] args) {

        int[] numeros = {5, 10, 15, 20, 25};
        int soma = 0;
        for (int numero : numeros) {
            soma += numero;
        }
        System.out.println("A soma dos elementos é : "+ soma);

    }
}
