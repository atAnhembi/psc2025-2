import java.util.Scanner;

public class Exemplo03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int idade;

        System.out.println("Informe a sua idade:");
        idade = scanner.nextInt();

        if (idade >= 18) {
            System.out.println("Pode dirigir");
        } else {
            System.out.println("Não pode dirigir");
        }
        
        System.out.println("Fim");
        scanner.close();
    }
}
