import java.util.Scanner;

// Exercicio 18: ler 8 temperaturas e mostrar a maior
public class Exercicio18 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] temperaturas = new double[8];

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura " + (i + 1) + ": ");
            temperaturas[i] = entrada.nextDouble();
        }

        double maior = temperaturas[0];
        for (int i = 1; i < temperaturas.length; i++) {
            if (temperaturas[i] > maior) {
                maior = temperaturas[i];
            }
        }

        System.out.println("\nMaior temperatura registrada: " + maior);

        entrada.close();
    }
}
