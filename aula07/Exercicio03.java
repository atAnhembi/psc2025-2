import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double n1, n2;
        char operacao;
        String resultado;

        System.out.println("\nCalculadora simples:\n");
        System.out.print("Informe o primeiro número: ");
        n1 = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe o segundo número: ");
        n2 = Double.parseDouble(teclado.nextLine());
        System.out.print("Informe uma das operações (+ - * /): ");
        operacao = teclado.nextLine().charAt(0);

        switch (operacao) {
            case '+':
                resultado = n1 + " + " + n2 + " = " + (n1 + n2);
                break;
            case '-':
                resultado = n1 + " - " + n2 + " = " + (n1 - n2);
                break;
            case '*':
                resultado = n1 + " * " + n2 + " = " + (n1 * n2);
                break;
            case '/':
                if(n2 == 0){
                    resultado = "Erro: divisão por zero.";
                } else {
                    resultado = n1 + " / " + n2 + " = " + (n1 / n2);
                }
                break;
        
            default:
                resultado = "Operação inválida";
                break;
        }

        System.out.println(resultado);

        teclado.close();
    }
}
