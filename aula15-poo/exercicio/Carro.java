package exercicio;

public class Carro {
    String marca;
    String modelo;
    private int anoFabricacao;

    public void alterarAno(int novoAno) {
        if(novoAno >= 1900 && novoAno < 2026){
            anoFabricacao = novoAno;
        } else {
            anoFabricacao = 2025;
        }
    }

    public void exibirDados() {
        System.out.println("Carro: " + 
            marca + ": " + modelo + ": " + 
            anoFabricacao);
    }
}
