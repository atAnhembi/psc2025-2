import java.util.Scanner;

public class Exemplo01 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        final int TAMANHO = 5;
        double notas[] = new double[TAMANHO];
        String nomes[] = new String[TAMANHO];
        double soma, media;

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Digite o nome do aluno:");
            nomes[i] = entrada.nextLine();
            System.out.println("Digite a nota do aluno:");
            notas[i] = Double.parseDouble(entrada.nextLine());
        }

        // percorre o vetor ao contrário (fim para o começo)
        // for (int i = notas.length - 1; i >= 0; i--) {
        //     System.out.println(notas[i]);
        // }

        soma = 0;
        for (int i = 0; i < notas.length; i++) {
            soma = soma + notas[i];
        }

        media = soma / notas.length;

        System.out.println("Media = " + media);


        // Dada a média das notas, liste todas as notas
        // que estão acima da média
        System.out.println("Notas cima da média:");
        for (int i = 0; i < notas.length; i++) {
            if(notas[i] > media) {
                // System.out.printf("nota %dº = %.2f\n",(i+1), notas[i]);
                System.out.printf("nota %.2f do aluno(a) %s\n", notas[i], nomes[i]);
            }
        }
        
        entrada.close();
    }
}
