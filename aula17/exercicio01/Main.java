package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int entrada;
        Televisao tv = new Televisao();

        tv.exibirDados();

        System.out.println("Informe o canal desejado:");
        entrada = scanner.nextInt();
        tv.setCanal(entrada);

        tv.aumentarVolume();

        tv.exibirDados();

        scanner.close();

    }
}
