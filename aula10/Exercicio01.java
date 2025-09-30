import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero, pares = 0, impares = 0;

        for (int i = 1; i < 11; i++) {
            System.out.printf("\nDigite o %dº número:", i);
            numero = teclado.nextInt();
            if (numero % 2 == 0) {
                pares++;
            } else {
                impares++;
            }
        }
        System.out.println("O total de pares é: " + pares);
        System.out.println("O total de impares é: " + impares);

        teclado.close();
    }
}
