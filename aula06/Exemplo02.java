import java.util.Scanner;

public class Exemplo02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        System.out.println("1-somar");
        System.out.println("2-substrair");
        System.out.println("3-multiplicar");
        System.out.println("4-dividir");
        opcao = scanner.nextInt();

        if (opcao == 1) {
            System.out.println("Vc escolheu somar");
        } else {
            if (opcao == 2) {
                System.out.println("Vc escolheu subtrair");
            } else {
                if (opcao == 3) {
                    System.out.println("Vc escolheu multiplicar");
                } else {
                    if (opcao == 4) {
                        System.out.println("Vc escolheu dividir");
                    } else {
                        System.out.println("Opcão inválida");
                    }
                }
            }
        }

        switch (opcao) {
            case 1:
                System.out.println("Vc escolheu somar");
                break;
            case 2:
                System.out.println("Vc escolheu subtrair");
                break;
            case 3:
                System.out.println("Vc escolheu multiplicar");
                break;
            case 4:
                System.out.println("Vc escolheu dividir");
                break;
            default:
                System.out.println("Opcão inválida");
                break;
        }

        scanner.close();

    }
}
