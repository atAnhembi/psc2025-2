package exemplo;
public class Carro {
    private String marca;
    private String modelo;
    private int anoFabricacao;


    // Construtor default
    public Carro() {
        this.marca = "Não definida";
        this.modelo = "Não informado";
        this.anoFabricacao = 2025;
    }

    // Constutor sobrecarregado
    public Carro(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.anoFabricacao = ano;
    }

    public void setAno(int novoAno) {
        if(novoAno >= 1900 && novoAno < 2026){
            anoFabricacao = novoAno;
        } else {
            anoFabricacao = 2025;
        }
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getMarca() {
        return marca;
    }


    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getModelo() {
        return modelo;
    }

    public void exibirDados() {
        System.out.println("Carro: " + 
            marca + ": " + modelo + ": " + 
            anoFabricacao);
    }
}