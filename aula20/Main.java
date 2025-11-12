public class Main {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Emerson");
        Pessoa pessoa = new Pessoa("Paduan");

        estudante.apresentar();
        pessoa.apresentar();

        Pessoa p1 = new Estudante("Carlos");

        p1.apresentar();

        System.out.println(p1.toString());
    }
}
