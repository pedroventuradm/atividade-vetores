import java.util.Scanner;

// Exercicio 15: os N primeiros termos da sequencia de Fibonacci
public class Exercicio15 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro positivo N: ");
        int n = entrada.nextInt();

        if (n <= 0) {
            System.out.println("Digite um numero positivo!");
        } else {
            long[] fibonacci = new long[n];

            // os dois primeiros termos sao 1 e 1
            fibonacci[0] = 1;
            if (n > 1) {
                fibonacci[1] = 1;
            }

            // cada termo eh a soma dos dois anteriores
            for (int i = 2; i < n; i++) {
                fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
            }

            System.out.println("\nPrimeiros " + n + " termos de Fibonacci:");
            for (int i = 0; i < n; i++) {
                System.out.print(fibonacci[i] + " ");
            }
            System.out.println();
        }

        entrada.close();
    }
}
