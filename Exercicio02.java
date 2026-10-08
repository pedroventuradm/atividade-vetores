import java.util.Scanner;

// Exercicio 02: dois vetores de 10 elementos e o vetor resultante da intercalacao
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] vetorA = new double[10];
        double[] vetorB = new double[10];
        double[] intercalado = new double[20];

        System.out.println("Preencha o vetor A:");
        for (int i = 0; i < vetorA.length; i++) {
            System.out.print("A[" + i + "]: ");
            vetorA[i] = entrada.nextDouble();
        }

        System.out.println("\nPreencha o vetor B:");
        for (int i = 0; i < vetorB.length; i++) {
            System.out.print("B[" + i + "]: ");
            vetorB[i] = entrada.nextDouble();
        }

        // intercala: A[0], B[0], A[1], B[1], ...
        for (int i = 0; i < 10; i++) {
            intercalado[i * 2] = vetorA[i];
            intercalado[i * 2 + 1] = vetorB[i];
        }

        System.out.println("\nVetor intercalado:");
        for (int i = 0; i < intercalado.length; i++) {
            System.out.print(intercalado[i] + " ");
        }
        System.out.println();

        entrada.close();
    }
}
