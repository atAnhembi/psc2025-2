package exe1;


public class Main {
    public static void main(String[] args) {

        try {
            Carro carro = new Carro("Chevrolet", "Cruze", 5);
            
            carro.abastecer(10);
            boolean andou = carro.andar(200);

            if(andou) {
                System.out.println("O carro andou");
            } else {
                System.out.println("Nâo há combustível para essa viagem");
            }

            System.out.println(carro);

        } catch (Exception e) {
            System.out.println("Erro: carro não criado - "+ e.getMessage());
        }
        

        
    }
}
