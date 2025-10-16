import java.util.Scanner;

public class Votacao {
    public static void main(String[] args) {
        final int MAX_ELEITORES = 7;
        Scanner scanner = new Scanner(System.in);
        int voto, votosValidos;
        int votosBranco = 0, votosNulo = 0;
        int candidato1 = 0, candidato2 = 0, candidato3 = 0;

        for (int i = 0; i < MAX_ELEITORES; i++) {
            System.out.println("Digite o seu voto:");
            voto = scanner.nextInt();

            switch (voto) {
                case 1:
                    candidato1++;
                    break;
                case 2:
                    candidato2++;
                    break;
                case 3:
                    candidato3++;
                    break;
                case 4:
                    votosBranco++;
                    break;
                default:
                    votosNulo++;
                    break;
            }
        }

        int vencedor = 0;
        if (candidato1 > candidato2 && candidato1 > candidato3) {
            vencedor = 1;
        } else {
            if (candidato2 > candidato1 && candidato2 > candidato3) {
                vencedor = 2;
            } else {
                if (candidato3 > candidato1 && candidato3 > candidato2) {
                    vencedor = 3;
                }
            }
        }
        System.out.print("\n*** Resultado: ");
        if (vencedor == 0) {
            System.out.println("Teremos 2º turno\n");
        } else {
            System.out.println("Candidato vencedor: " + vencedor + "\n");
        }

        votosValidos = MAX_ELEITORES - votosNulo;

        System.out.printf("Candidato 1: %d - %.2f%% \n", candidato1, ((float) candidato1 / votosValidos) * 100);
        System.out.printf("Candidato 2: %d - %.2f%% \n", candidato2, ((float) candidato2 / votosValidos) * 100);
        System.out.printf("Candidato 3: %d - %.2f%% \n", candidato3, ((float) candidato3 / votosValidos) * 100);
        System.out.printf("Votos brancos: %d\n", votosBranco);
        System.out.printf("Votos nulo: %d\n", votosNulo);
        System.out.printf("Brancos e Nulos: %.2f %%\n", ((float) votosBranco + votosNulo) / MAX_ELEITORES * 100);
        scanner.close();
    }

}

/*
       
 */
