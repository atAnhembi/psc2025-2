/* 
    Escreva um programa que leia do telado as duas
    notas de um aluno, calcule a média, e informe
    se ele foi aprovado ou reprovado.
    Considere a média para aprovação 7.0
*/

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota1, nota2, media;

        // Entrada de dados
        System.out.println("Digite sua primeira nota:");
        nota1 = entrada.nextDouble();
        System.out.println("Digite sua segunda nota:");
        nota2 = entrada.nextDouble();

        // Processamento
        media = (nota1 + nota2) / 2.0;

        // Saída
        if(media >= 7) {
            System.out.println("Aluno aprovado com média " + media);
        } else {
            System.out.println("Aluno reprovado com média " + media);
        }

        entrada.close();
    }
}
