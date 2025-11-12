public class Pessoa extends Object {
    private String nome;

    public Pessoa() {

    }
    // overload: polimorfismo na mesma classe
    public Pessoa(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void apresentar() {
        System.out.println("Boa noite! Eu sou " + nome);
    }

    @Override
    public String toString() {
        return "Sou pessoa";
    }
}
