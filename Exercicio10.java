import java.util.Scanner;

// Exercicio 10: tabuada de um numero ate 10
public class Exercicio10 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite um numero inteiro: ");
        int numero = entrada.nextInt();

        System.out.println("\nTabuada do " + numero + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(numero + " x " + i + " = " + (numero * i));
        }

        entrada.close();
    }
}
