import java.util.Scanner;

/*
  O custo de um carro novo ao consumidor é a soma do custo de fábrica com a porcentagem do distribuidor e 
  dos impostos (aplicados ao custo de fábrica).
  Supondo que o percentual do distribuidor seja de 28% e os impostos de 45%, 
  escreva um programa que leia o custo de fábrica de um carro, 
  calcule e exiba o custo final ao consumidor e o imposto a ser pago.
 */

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double custo, imposto, precoDistribuidor, valorConsumidor;

        // entrada de dados
        System.out.println("Informe o valor de custo:");
        custo = teclado.nextDouble();

        // processamento
        imposto = custo * 0.45;
        precoDistribuidor = custo * 0.28;
        valorConsumidor = custo + precoDistribuidor + imposto;

        // saída
        System.out.println("O valor do imposto é: " + imposto);
        System.out.println("O valor total é " + valorConsumidor);

        teclado.close();
    }
}
