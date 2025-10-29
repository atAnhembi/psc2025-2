package exemplo;
public class Main {
    public static void main(String[] args) {
        Carro carro1 = new Carro("VW", "Gol", 1980);
        Carro carro2 = new Carro();

        //carro1.setMarca("VW");
        // carro1.setModelo("Gol");
        // carro1.setAno(1980);

        String marca = carro1.getMarca();
        System.out.println("A marca do carro é " + marca);
        
        int ano = carro1.getAnoFabricacao();
        System.out.println("Carro fabricado em " + ano);
        System.out.println("Idade: " + (2025-ano));

        String modelo = carro1.getModelo();
        System.out.println("O modelo do carro: " + modelo);


        carro2.exibirDados();
    }
}