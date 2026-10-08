import java.util.Random;
import java.util.Scanner;

// Exercicio 06: vetor com 30 inteiros aleatorios (1 a 100), usuario digita um valor e ele eh removido
public class Exercicio06 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random sorteio = new Random();
        int[] vetor = new int[30];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sorteio.nextInt(100) + 1;
        }

        System.out.println("Vetor original:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        System.out.print("\n\nDigite um valor para remover: ");
        int valor = entrada.nextInt();

        // conta quantas vezes o valor aparece
        int quantidade = 0;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                quantidade++;
            }
        }

        if (quantidade == 0) {
            System.out.println("O valor " + valor + " nao existe no vetor.");
        } else {
            // o vetor em Java nao muda de tamanho, entao crio um novo menor
            int[] novoVetor = new int[vetor.length - quantidade];
            int posicao = 0;

            for (int i = 0; i < vetor.length; i++) {
                if (vetor[i] != valor) {
                    novoVetor[posicao] = vetor[i];
                    posicao++;
                }
            }

            System.out.println("Valor removido " + quantidade + " vez(es).");
            System.out.println("\nNovo vetor:");
            for (int i = 0; i < novoVetor.length; i++) {
                System.out.print(novoVetor[i] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}
