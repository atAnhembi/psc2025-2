import java.util.Scanner;

public class Exemplo04 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        String nome;

        System.out.println("Digite  seu nome:");
        nome = entrada.nextLine();

        System.out.println("Boa noite " + nome);
        entrada.close();
    }
}
