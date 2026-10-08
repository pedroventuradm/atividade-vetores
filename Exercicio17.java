import java.util.Scanner;

// Exercicio 17: ler as notas de 10 alunos e calcular a media
public class Exercicio17 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double[] notas = new double[10];
        double soma = 0;

        for (int i = 0; i < notas.length; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = entrada.nextDouble();
            soma = soma + notas[i];
        }

        double media = soma / notas.length;
        System.out.println("\nMedia das notas: " + media);

        entrada.close();
    }
}
