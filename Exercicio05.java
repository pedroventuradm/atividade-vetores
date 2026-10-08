import java.util.Random;

// Exercicio 05: vetor com 15 inteiros aleatorios entre 1 e 50, verifica o 20 e mostra o indice
public class Exercicio05 {
    public static void main(String[] args) {
        Random sorteio = new Random();
        int[] vetor = new int[15];

        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sorteio.nextInt(50) + 1;
        }

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }
        System.out.println();

        boolean achou = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 20) {
                System.out.println("O numero 20 foi encontrado no indice " + i);
                achou = true;
            }
        }

        if (!achou) {
            System.out.println("O numero 20 nao existe no vetor.");
        }
    }
}
