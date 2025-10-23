package exemplo01;

public class App {
    public static void main(String[] args) {
        // criar um objeto do tipo pessoa
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();

        pessoa1.nome = "Carlos";
        pessoa1.idade = 14;
        pessoa1.apresentar();
        if(pessoa1.ehMaior()){
            System.out.println("Posso dirigir");
        } else {
            System.out.println("Não posso dirigir");
        }

        pessoa2.nome = "Ana";
        pessoa2.apresentar();


    }
}
