/*

Escreva um jogo onde o jogador deve adivinhar um número secreto gerado aleatoriamente.
Na segunda versão, permita que o jogador faça várias tentativas, e ao final informe quantas tentativas
foram feitas para que ele acertasse o número.

*/

import java.util.Random;
import java.util.Scanner;

public class Exercicio01v02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int tentativaUsuario, numeroSecreto, tentativas = 0;
        boolean acertou;

        numeroSecreto = random.nextInt(10) + 1;

        acertou = false;
        while (!acertou) {
            System.out.println("Tente adivinhar o número secreto(1 a 10):");
            tentativaUsuario = scanner.nextInt();
            tentativas++;

            acertou = (numeroSecreto == tentativaUsuario);

            if (tentativaUsuario > numeroSecreto) {
                System.out.println("Você errou. O número é menor");
            } else {
                if(tentativaUsuario < numeroSecreto) {
                    System.out.println("Você errou. O número é maior");
                }
            }
        }

        System.out.printf("Você acertou em %d tentativas!\n", tentativas);
         
        scanner.close();
    }
}