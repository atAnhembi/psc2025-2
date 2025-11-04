public class Main {
    public static void main(String[] args) {
        Endereco ender = new Endereco("Av Paulista", 2000, " 1 andar");
        Funcionario func1 = new Funcionario("João", "TI", ender, 2);
        Dependente dep1 = new Dependente("Ana", 10);
        Dependente dep2 = new Dependente("Fabiano", 12);

        func1.setDependente(0, dep1);
        func1.setDependente(1, dep2);

        System.out.println(func1.getNome());
        System.out.println(func1.getEndereco().getLocal());
        System.out.println("Dependentes:");
        System.out.println(func1.getDependente(0));
        System.out.println(func1.getDependente(1));
    }
}
