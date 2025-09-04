public class Exemplo01 {
    public static void main(String[] args) {
        int numeroInteiro = 5;
        double numeroDouble;

        numeroDouble = 7.9;

        // converte o dado que está dentro do double para int
        // mas não modifica as variaveis
        numeroInteiro = (int) numeroDouble;

        System.out.println(numeroInteiro);
        System.out.println(numeroDouble);

    }
}
