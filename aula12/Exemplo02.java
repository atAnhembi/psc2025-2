public class Exemplo02 {
    public static void main(String[] args) {
        int resposta;
        
        resposta = soma(12, 23);

        System.out.println("A soma = " + resposta);
    }


    static int soma(int n1, int n2) {
        int resultado;

        resultado = n1 + n2;

        return resultado;
    }
}
