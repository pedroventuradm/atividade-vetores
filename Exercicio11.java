import java.util.Scanner;

// Exercicio 11: ler 10 temperaturas e calcular a media
public class Exercicio11 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] temperaturas = new double[10];
        double soma = 0;

        for (int i = 0; i < temperaturas.length; i++) {
            System.out.print("Digite a temperatura " + (i + 1) + ": ");
            temperaturas[i] = entrada.nextDouble();
            soma = soma + temperaturas[i];
        }

        double media = soma / temperaturas.length;
        System.out.println("\nTemperatura media: " + media);

        entrada.close();
    }
}
