
import java.util.Scanner;

public class Exercicio02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero1, numero2;

        System.out.println("Digite o primeiro numero:");
        numero1 = teclado.nextInt();
        System.out.println("Digite o segundo numero:");
        numero2 = teclado.nextInt();

        if (numero1 > numero2) {
            System.out.println(numero1 + " > " + numero2);
        } else {
            if (numero1 < numero2) {
                System.out.println(numero1 + " < " + numero2);
            } else {
                System.out.println(numero1 + " = " + numero2);
            }
        }
        teclado.close();
    }
}
