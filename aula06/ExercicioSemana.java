import java.util.Scanner;

public class ExercicioSemana {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dia;

        System.out.println("Digite o sia da semana:");
        dia = scanner.nextInt();

        scanner.close();

        switch (dia) {
            case 1:
                System.out.println("segunda-feira");
                break;
            case 2:
                System.out.println("terça-feira");
                break;
            case 3:
                System.out.println("quarta-feira");
                break;
            case 4:
                System.out.println("quinta-feira");
                break;
            case 5:
                System.out.println("sexta-feira");
                break;
            case 6:
                System.out.println("sabado");
                break;
            case 7:
                System.out.println("domingo");
                break;
            default:
                System.out.println("dia inválido");
                break;
        }
    }
}
