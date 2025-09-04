import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pontos, chaves;

        // entrada de dados
        System.out.println("Informe quantas chaves você encontrou: ");
        chaves = teclado.nextInt();
        System.out.println("Informe quantos pontos você fez: ");
        pontos = teclado.nextInt();

        // processamento
        boolean atingiuPontos = pontos >= 100;
        boolean achouChaves = chaves >= 3;

        // saída
        if(atingiuPontos && achouChaves) {
            System.out.println("Passou de fase");
        } else {
            System.out.println("Não passou...");
        }

        teclado.close();
    }
}
