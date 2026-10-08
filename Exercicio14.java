import java.util.Scanner;

// Exercicio 14: calcular o tempo total de producao com base no numero de etapas
// O enunciado nao diz quanto tempo cada etapa leva, entao considerei 30 minutos por etapa.
public class Exercicio14 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int minutosPorEtapa = 30;

        System.out.print("Digite o numero de etapas de producao: ");
        int etapas = entrada.nextInt();

        if (etapas <= 0) {
            System.out.println("Digite um numero positivo!");
        } else {
            int tempoTotal = etapas * minutosPorEtapa;
            int horas = tempoTotal / 60;
            int minutos = tempoTotal % 60;

            System.out.println("\nTempo total de producao: " + tempoTotal + " minutos");
            System.out.println("Ou seja: " + horas + " hora(s) e " + minutos + " minuto(s)");
        }

        entrada.close();
    }
}
