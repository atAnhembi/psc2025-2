
import java.util.Scanner;

public class Exercicio01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.println("Digite um número inteiro:");
        numero = teclado.nextInt();

        boolean ehPar = (numero % 2 == 0);

        if (ehPar) {
            System.out.println("Este número é par");
        } else {
            System.out.println("Este número é impar");
        }

        String resultado = ehPar ? "Este número é par" : "Este número é impar";
        System.out.println(resultado);

        teclado.close();
    }
}
