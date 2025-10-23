package exemplo01;

// Uma classe é um MODELO para um objeto

public class Pessoa {
    // atributos são as características do objeto
    String nome;
    int idade;

    // métodos são as "ações" do objeto
    public void apresentar() {
        System.out.println("Olá eu sou " + nome);
    }

    public boolean ehMaior() {
        // if (idade >= 18)
        //     return true;
        // else
        //     return false;
        return (idade >= 18);
    }
}
