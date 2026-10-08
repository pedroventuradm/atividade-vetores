import java.util.Random;

// Exercicio 04: vetor com 20 inteiros aleatorios entre 1 e 30 e verifica se o 25 existe
public class Exercicio04 {
    public static void main(String[] args) {
        Random sorteio = new Random();
        int[] vetor = new int[20];

        // nextInt(30) gera de 0 a 29, entao somo 1 para ficar de 1 a 30
        for (int i = 0; i < vetor.length; i++) {
            vetor[i] = sorteio.nextInt(30) + 1;
        }

        System.out.println("Vetor:");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print(vetor[i] + " ");
        }

        boolean achou = false;
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == 25) {
                achou = true;
            }
        }

        if (achou) {
            System.out.println("\n\nO numero 25 existe no vetor.");
        } else {
            System.out.println("\n\nO numero 25 NAO existe no vetor.");
        }
    }
}
