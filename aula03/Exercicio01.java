import java.util.Scanner;

/*
 * Faça um programa que leia o salário de um funcionário. 
 * Sabendo que o salário do funcionário teve um aumento de 25%, calcular e mostrar o novo salário.
 */

public class Exercicio01 {
    public static void main(String[] args) {
        // entrada de dados
        // 1. criar um scanner
        // 2. criar uma variável para guardar o salário
        // 3. ler o valor do salário
        Scanner teclado = new Scanner(System.in);
        double salario, novoSalario;

        System.out.println("Digite o valor do salário atual:");
        salario = teclado.nextDouble();

        // processamento: calcular o novo salário
        novoSalario = salario * 1.25;

        // saída: exibir o novo salário
        System.out.println("Novo salário (+25%): " + novoSalario);
        
        teclado.close();
    }
}
