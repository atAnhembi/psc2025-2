import java.util.Scanner;

public class Exercicio01A {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pontos, chaves;

        // entrada de dados
        System.out.println("Informe quantas chaves você encontrou: ");
        chaves = teclado.nextInt();

        boolean achouChaves = chaves >= 3;

        if (achouChaves) {
            System.out.println("Informe quantos pontos você fez: ");
            pontos = teclado.nextInt();

            boolean atingiuPontos = pontos >= 100;

            if (atingiuPontos) {
                System.out.println("Passou de fase");
            } else {
                System.out.println("Não passou...");
            }
        } else {
            System.out.println("Não passou...");
        }

        teclado.close();
    }
}
