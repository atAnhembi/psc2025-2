/*

Escreva um jogo onde o jogador deve adivinhar um número secreto gerado aleatoriamente.
Na primeira versão do jogo, o jogador tem apenas um a chance e o intervalo do número é entre 1 e 10.

*/

import java.util.Random;
import java.util.Scanner;

public class Exercicio01v01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tentativaUsuario;
        int numeroSecreto;
        boolean acertou;

        // 1. Entrada
        System.out.println("Tente adivinhar o número secreto:");
        tentativaUsuario = scanner.nextInt();

        // 2. Processamento
        numeroSecreto = random.nextInt(10) + 1;
        acertou = (numeroSecreto == tentativaUsuario);

        // 3. Saída
        if (acertou) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou. O número era: " + numeroSecreto);
        }

        scanner.close();
    }
}