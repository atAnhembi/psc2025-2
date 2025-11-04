public class Funcionario {
    private String nome;
    private String departamento;
    private Endereco endereco;
    private Dependente dependentes[];

    public Funcionario(String nome, String departamento,
        Endereco endereco, int numDependentes) {
            this.nome = nome;
            this.departamento = departamento;
            this.endereco = endereco;
            dependentes = new Dependente[numDependentes];
    }

    public void setDependente(int posicao, 
        Dependente dependente) {
            dependentes[posicao] = dependente;
    }


    public String getDependente(int posicao) {
        return dependentes[posicao].getNome();
    }

    public String getNome() {
        return nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
}
