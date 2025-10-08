public class Exemplo01 {
    public static void main(String[] args) {
        System.out.println("\nMeu software v 0.1");
        linha();
        System.out.println("Meu principal");
        linhaFlex(5);
        linhaFlex(15);
        linhaFlex(50);
        linhaFlex2(10, '*');
        linhaFlex2(10, '#');
    }

    static void linha() {
        System.out.println("-------------------------");
    }

    static void linhaFlex(int tamanho) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    static void linhaFlex2(int tamanho, char simbolo) {
        for (int i = 0; i < tamanho; i++) {
            System.out.print(simbolo);
        }
        System.out.println();
    }

}
