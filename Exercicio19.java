import java.util.Scanner;

// Exercicio 19: verificar se um codigo de produto esta em um vetor pre-definido
public class Exercicio19 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        // vetor ja preenchido com os codigos dos produtos
        int[] codigos = {101, 202, 303, 404, 505, 606, 707, 808, 909, 1010};

        System.out.print("Digite o codigo do produto: ");
        int codigo = entrada.nextInt();

        boolean achou = false;
        for (int i = 0; i < codigos.length; i++) {
            if (codigos[i] == codigo) {
                achou = true;
            }
        }

        if (achou) {
            System.out.println("Produto encontrado no estoque!");
        } else {
            System.out.println("Produto NAO encontrado no estoque.");
        }

        entrada.close();
    }
}
