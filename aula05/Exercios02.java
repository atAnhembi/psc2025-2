import java.util.Scanner;

public class Exercios02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double salario;

        // entrada de dados
        System.out.println("Informe o valor do salário");
        salario = teclado.nextDouble();

        // if (salario <= 600) {
        //     System.out.println("Isento");
        // }
        // if (salario > 600 && salario <= 1200) {
        //     System.out.println("20%");
        // }
        // if (salario > 1200 && salario <= 2000) {
        //     System.out.println("25%");
        // }
        // if (salario > 2000) {
        //     System.out.println("30%");
        // }

        if (salario <= 600) {
            System.out.println("Isento");
        } else {
            if (salario <= 1200) {
                System.out.println("20%");
            } else {
                if (salario <= 2000) {
                    System.out.println("25%");
                } else {
                    System.out.println("30%");
                }
            }
        }

        teclado.close();
    }
}
