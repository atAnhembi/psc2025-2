public class Endereco {
    private String logradouro;
    private int numero;
    private String complemento;

    public Endereco(String logradouro, 
        int numero, String complemento) {

            this.logradouro = logradouro;
            this.numero = numero;
            this.complemento = complemento;
    }


    public String getLocal() {
        return logradouro + ", " + numero +
            ((complemento != null)?complemento:"");
    }
}
