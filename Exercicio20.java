import java.util.Scanner;

// Exercicio 20: ler 10 precos e ordenar em ordem crescente (Bubble Sort)
public class Exercicio20 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] precos = new double[10];

        for (int i = 0; i < precos.length; i++) {
            System.out.print("Digite o preco do produto " + (i + 1) + ": ");
            precos[i] = entrada.nextDouble();
        }

        // Bubble Sort: compara dois vizinhos e troca se estiverem fora de ordem
        for (int i = 0; i < precos.length - 1; i++) {
            for (int j = 0; j < precos.length - 1 - i; j++) {
                if (precos[j] > precos[j + 1]) {
                    double auxiliar = precos[j];
                    precos[j] = precos[j + 1];
                    precos[j + 1] = auxiliar;
                }
            }
        }

        System.out.println("\nPrecos em ordem crescente:");
        for (int i = 0; i < precos.length; i++) {
            System.out.println("R$ " + precos[i]);
        }

        entrada.close();
    }
}
