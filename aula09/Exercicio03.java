/*
 Escreva um programa que leia um valor que representa o
 número de horas trabalhadas no dia por um colaborador.
 O programa deve calcular quantas horas extras foram feitas
 ou o número de horas que faltaram para completar o turno de 8 horas.

 O programa não deve aceitar valores negativos ou maiores
 que 12. Faça a leitura dos valores até que ele digite
 o valor dentro do intervalo permitido.
 */

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        final int JORNADA_TRABALHO = 8;
        Scanner entrada = new Scanner(System.in);
        double horasTrabalhadas, horasExtra;

        System.out.println("\nInforme o número de horas trabalhadas:");
        horasTrabalhadas = entrada.nextDouble();

        while(horasTrabalhadas < 0 || horasTrabalhadas > 12) {
            System.out.println("Valor inválido. Deve ser entre 0 e 12");

            System.out.println("\nInforme o número de horas trabalhadas:");
            horasTrabalhadas = entrada.nextDouble();
        }

        entrada.close();
        
        horasExtra = horasTrabalhadas - JORNADA_TRABALHO;

        if(horasExtra > 0) {
            System.out.printf("Você fez %.1f hora(s) extra\n", horasExtra);
        } else {
            if(horasExtra < 0) {
                System.out.printf("Faltaram %.1f horas para concluir o turno\n", horasExtra * -1);
            } else {
                System.out.println("Você cumpriu exatamente seu turno");
            }
        }
    }
}