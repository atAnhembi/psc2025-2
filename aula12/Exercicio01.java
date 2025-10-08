/* 
 Considere um jogo de dados.
 Um jogador deseja verificar se um dado é viciado.
 Para isso ele quer jogar o mesmo dado 100 vezes e verificar se cada lado 
 ocorreu  de forma aproximadamente igual.
 Você deve escrever um programa em Java que simule os 100 lançamentos e 
 contabilize  a quantidade de vezes que cada lado foi sortado.
 Você vai usar:
 - um vetor com 6 posições
 - o método random para gerar os valores aleatoriamente
*/

import java.util.Random;

public class Exercicio01 {
    public static void main(String[] args) {
        Random random = new Random();
        final int SOTEIOS = 100;
        int dado[] = new int [6]; // tamanho 6

        for (int i = 0; i < SOTEIOS; i++) {
            int lado = random.nextInt(6) + 1; // sorteia valores de 1 à 6
            // System.out.println(lado);
            dado[lado-1]++; //soma 1 no índice correspondente ao lado
            // dado[lado-1] = dado[lado-1] + 1;
            // a = a + 1;
            // a++;
        }

        for (int i = 0; i < dado.length; i++) {
            System.out.printf("lado %d sortado %d vezes\n", i+1, dado[i]);
        }
    }   
}
