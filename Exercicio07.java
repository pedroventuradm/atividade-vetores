import java.util.Scanner;

// Exercicio 07: vetor de 5 posicoes decimais, encontrar o maior e o menor valor
public class Exercicio07 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] vetor = new double[5];

        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o valor " + (i + 1) + ": ");
            vetor[i] = entrada.nextDouble();
        }

        // comeca assumindo que o primeiro eh o maior e o menor
        double maior = vetor[0];
        double menor = vetor[0];

        for (int i = 1; i < vetor.length; i++) {
            if (vetor[i] > maior) {
                maior = vetor[i];
            }
            if (vetor[i] < menor) {
                menor = vetor[i];
            }
        }

        System.out.println("\nMaior valor: " + maior);
        System.out.println("Menor valor: " + menor);

        entrada.close();
    }
}
