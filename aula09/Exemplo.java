public class Exemplo {
    public static void main(String[] args) {
        int cont = 1;

        while (cont <= 10) {

            if(cont == 5) {
                cont++;
                continue; // volte para o while
            }

            if(cont == 8) {
                break; // interrompe o laço
            }

            System.out.println(cont);
            cont++;
        }

    }
}
