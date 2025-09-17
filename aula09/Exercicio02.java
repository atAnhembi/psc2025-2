import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numero, cont;

        System.out.print("\nInforme o número da tabuada (1 a 10): ");
        numero = entrada.nextInt();

        entrada.close();

        if(numero < 1 || numero > 10) {
            System.out.println("Valor incorreto");
            return; // sai do main
        }

        cont = 0;
        while (cont < 11) {
            // System.out.println(numero + " x " + cont + " = " + (numero * cont));
            System.out.printf("%2d X %2d = %2d\n", numero, cont, numero * cont);
            cont++;
        }
    }
}
