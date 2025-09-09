public class Exemplo01 {
    public static void main(String args[]) {
        int idade = 18;
        String resultado;

        // if(idade >= 18) {
        //     resultado = "Pode dirigir";
        // } else {
        //     resultado = "Não pode dirigir";
        // }

        resultado = (idade >= 18)?"Pode dirigir" :"Não pode dirigir";

        System.out.println(resultado);
    }
}
