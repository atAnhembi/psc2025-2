package exercicio;

public class Main {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Caio");
        Pessoa p2 = new Pessoa("Caio", "cario@email.com");
        Pessoa p3 = new Pessoa("Caio", "cario@email.com", 21);

        p1.exibirDados();
        p2.exibirDados();
        p3.exibirDados();
    }
}
