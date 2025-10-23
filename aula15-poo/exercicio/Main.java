package exercicio;

public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.marca = "VW";
        carro1.modelo = "Gol";
        carro1.alterarAno(1980);

        carro2.marca = "BMW";
        carro2.modelo = "X1";
        carro2.alterarAno(202);

        carro1.exibirDados();
        carro2.exibirDados();
    }
}
