// Exercicio 12: imprimir os numeros pares de 1 a 50 usando for
public class Exercicio12 {
    public static void main(String[] args) {
        System.out.println("Numeros pares de 1 a 50:");

        for (int i = 1; i <= 50; i++) {
            // se o resto da divisao por 2 for 0, o numero eh par
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
