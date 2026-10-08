import java.util.Scanner;

// Exercicio 16: ler 5 respostas e imprimir na ordem inversa
public class Exercicio16 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] respostas = new int[5];

        for (int i = 0; i < respostas.length; i++) {
            System.out.print("Digite a resposta " + (i + 1) + ": ");
            respostas[i] = entrada.nextInt();
        }

        System.out.println("\nRespostas na ordem inversa:");
        // percorre do ultimo indice ate o primeiro
        for (int i = respostas.length - 1; i >= 0; i--) {
            System.out.println(respostas[i]);
        }

        entrada.close();
    }
}
