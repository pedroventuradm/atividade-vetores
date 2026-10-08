import java.util.Random;

// Exercicio 03: vetor com 10 inteiros aleatorios e calculo da media
public class Exercicio03 {
    public static void main(String[] args) {
        Random sorteio = new Random();
        int[] vetor = new int[10];
        int soma = 0;

        // preenche com numeros aleatorios de 0 a 99
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sorteio.nextInt(100);
            soma = soma + vetor[i];
        }

        System.out.println("Elementos do vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        double media = (double) soma / vetor.length;
        System.out.println("\n\nMedia dos elementos: " + media);
    }
}
