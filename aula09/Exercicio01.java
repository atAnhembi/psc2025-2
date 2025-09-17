import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int cont, base;
        String simbolo = "*";

        System.out.print("\nQual o tamanho da base? ");
        base = entrada.nextInt();

        if (base > 20) {
            base = 20;
        }

        cont = 1;
        while (cont <= base) {
            System.out.println(simbolo);
            simbolo = simbolo + "*";
            cont++;
        }

        entrada.close();
    }
}
