public class Exemplo {
    public static void main(String[] args) {        
        int n1 = 5;
        int n2 = 10;
        Object obj = null;

        try {
            int resposta = n1 / n2;
            System.out.println(resposta);
            System.out.println(obj.toString());

        } catch (NullPointerException e) {
            System.out.println("Erro Null Pointer: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Erro: Arithmetic" + e.getMessage());
        } catch (Exception e) {
            System.out.println("Erro:" + e.getMessage());
        } finally {
            System.out.println("Fechando os arquivos...");
        }

        System.out.println("Fim do programa");
    }
}
