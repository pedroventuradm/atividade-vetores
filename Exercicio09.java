import java.util.Scanner;

// Exercicio 09: imprimir recibos de 1 ate a quantidade desejada usando while
public class Exercicio09 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Quantos recibos deseja imprimir? ");
        int quantidade = entrada.nextInt();

        int contador = 1;
        while (contador <= quantidade) {
            System.out.println("Recibo numero " + contador);
            contador++;
        }

        entrada.close();
    }
}
