import java.util.Scanner;

// Exercicio 13: imprimir todos os primos menores ou iguais a N
public class Exercicio13 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro N: ");
        int n = entrada.nextInt();

        System.out.println("\nPrimos menores ou iguais a " + n + ":");

        for (int numero = 2; numero <= n; numero++) {
            boolean primo = true;

            for (int divisor = 2; divisor < numero; divisor++) {
                if (numero % divisor == 0) {
                    primo = false;
                }
            }

            if (primo) {
                System.out.print(numero + " ");
            }
        }
        System.out.println();

        entrada.close();
    }
}
