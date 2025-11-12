public class Estudante extends Pessoa {
    public Estudante(String nome) {
        // preciso chamar o construtor da 
        // super classe , pois ele exige parâmetro
        // super = Pessoa
        super(nome);
    }

    // indicação de sobrscrita de método
    @Override
    public void apresentar() {
        System.out.println("Olá! Eu sou o estudante " + getNome());
    }

    // @Override
    // public String toString() {
    //     return "Sou estudante";
    // }
}
