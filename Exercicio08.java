import java.util.Random;

// Exercicio 08: vetor A com 15 inteiros e vetor B como copia reversa de A
public class Exercicio08 {
    public static void main(String[] args) {
        Random sorteio = new Random();
        int[] vetorA = new int[15];
        int[] vetorB = new int[15];

        for (int i = 0; i < vetorA.length; i++) {
            vetorA[i] = sorteio.nextInt(100);
        }

        // o primeiro de A vai para o ultimo de B, e assim por diante
        for (int i = 0; i < vetorA.length; i++) {
            vetorB[vetorB.length - 1 - i] = vetorA[i];
        }

        System.out.println("Vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print(vetorA[i] + " ");
        }

        System.out.println("\n\nVetor B (reverso de A):");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print(vetorB[i] + " ");
        }
        System.out.println();
    }
}
