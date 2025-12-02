public class Exemplo2 {
    public static void main(String[] args) {

        System.out.println(nomeDia(10));

    }

    public static String nomeDia(int dia) throws RuntimeException {
        String vet[] = {"seg", "ter", "qua", "qui", "sex", "sab", "dom"};

        if(dia >= 0 && dia < vet.length) {
            return vet[dia];
        }
        throw new RuntimeException("Dia inválido");
    }
}
