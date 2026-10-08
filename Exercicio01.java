import java.util.Scanner;

// Exercicio 01: preencher vetor com 10 inteiros e mostrar os primos e suas posicoes
public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] vetor = new int[10];

        // preenche o vetor
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o numero " + (i + 1) + ": ");
            vetor[i] = entrada.nextInt();
        }

        System.out.println("\nNumeros primos e suas posicoes:");
        boolean achouPrimo = false;

        for (int i = 0; i < vetor.length; i++) {
            int numero = vetor[i];
            boolean primo = true;

            // numeros menores que 2 nao sao primos
            if (numero < 2) {
                primo = false;
            }

            // testa se algum numero divide ele
            for (int j = 2; j < numero; j++) {
                if (numero % j == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.println("Numero " + numero + " na posicao " + i);
                achouPrimo = true;
            }
        }

        if (!achouPrimo) {
            System.out.println("Nenhum numero primo foi encontrado.");
        }

        entrada.close();
    }
}
