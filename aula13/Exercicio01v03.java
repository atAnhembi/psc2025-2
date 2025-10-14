/*

Escreva um jogo onde o jogador deve adivinhar um número secreto gerado aleatoriamente.
Na terceira versão, a cada vez que o jogador acertar, aumente a o intervalo que o número secreto se
encontre (1…10, 1…20, 1…30) e permita que o jogador tenha um número limite de tentativas.

*/

import java.util.Random;
import java.util.Scanner;

public class Exercicio01v03 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tentativaUsuario, numeroSecreto, tentativas = 0;
        int nivel = 1, maxJogadas = 5;

        numeroSecreto = random.nextInt(10 * nivel) + 1;

        while (tentativas <= maxJogadas) {
            System.out.printf("Tente adivinhar o número secreto(1 a %d):\n", 10 * nivel);
            tentativaUsuario = scanner.nextInt();
            tentativas++;

            if (tentativaUsuario > numeroSecreto) {
                System.out.println("Você errou. O número é menor");
            } else {
                if(tentativaUsuario < numeroSecreto) {
                    System.out.println("Você errou. O número é maior");
                } else {
                    System.out.printf("Você acertou em %d tentativas!\n", tentativas);
                    nivel++;
                    System.out.println("Próximo nível: " + nivel);
                    maxJogadas++;
                    tentativas = 0;
                    numeroSecreto = random.nextInt(10 * nivel) + 1;
                }
            }
        }

        scanner.close();
    }
}