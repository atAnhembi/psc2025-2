/*
 Escreva um programa onde o usuário informa o valor de início
 e o valor final de uma contagem e o programa mostra na tela
 os valores entre os dois limites.
 Exemplo:
 inicio: 5
 final: 10
 exibie: 5 6 7 8 9 10
 */

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont;
        int inicio, fim;

        System.out.println("Digite o número inicial:");
        inicio = entrada.nextInt();
        System.out.println("Digite o numero final:");
        fim = entrada.nextInt();

        if (inicio <= fim) {
            cont = inicio;
            while (cont <= fim) {
                System.out.print(cont + " ");
                cont++;
            }
        } else {
            cont = inicio;
            while (cont >= fim) {
                System.out.print(cont + " ");
                cont--;
            }
        }
        entrada.close();
    }
}
