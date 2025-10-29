package exercicio;

/*
 A Pessoa deve permitir criaçao de um objeto Pessoa com os atributos:
 - nome
 - idade
 - email

 Regras:
 - Nome é obrigatório ao criar uma pessoa
 - Se idade não for fornecido, assume 18
 - Se email não fornecido, indica "não cadastrado"
 - O email e idade podem ser alterados, mas o nome não pode

 Crie métodos de acesso e faça todos os atributos privados

 */

public class Pessoa {
    private String nome;
    private String email;
    private int idade;

    // criamos 3 construtores sobrecarregados

    public Pessoa(String nome) {
        this.nome = nome;
        this.email = "não cadastrado";
        this.idade = 18;
    }

    public Pessoa(String nome, String email) {
        this.nome = nome;
        this.email = email;
        this.idade = 18;
    }

    public Pessoa(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    // métodos para acessar as informações

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public int getIdade() {
        return idade;
    }

    // método para alterar o email

    public void setEmail(String email) {
        this.email = email;
    }

    public void exibirDados() {
        System.out.println(nome + ", " + email + ", " + idade);
    }
}
