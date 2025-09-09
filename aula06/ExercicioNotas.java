import java.util.Scanner;

public class ExercicioNotas {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int qtdeFaltas;
        double nota1, nota2, media, exame;

        // entrada de dados
        System.out.println("Informe a quantidade de faltas:");
        qtdeFaltas = entrada.nextInt();
        System.out.println("Informe a primeira nota:");
        nota1 = entrada.nextDouble();
        System.out.println("Informe a segunda nota:");
        nota2 = entrada.nextDouble();

        // processamento
        if(qtdeFaltas >= 16) {
            System.out.println("Reprovado por faltas");
        } else {
            media = (nota1 + nota2) / 2;
            if(media >= 6) {
                System.out.println("Aprovado! Parabéns!");
            } else {
                System.out.println("Informe a nota do exame:");
                exame = entrada.nextDouble();
                media = (media + exame) / 2;
                if(media >= 5) {
                    System.out.println("Aprovado! Parabéns!");
                } else {
                    System.out.println("Reprovado por nota");
                }
            }
        }

        entrada.close();
        
    }
}
