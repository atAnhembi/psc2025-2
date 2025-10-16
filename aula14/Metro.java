import java.util.Random;

public class Metro {
    public static void main(String[] args) {
        Random random = new Random();
        int metro[] = new int[5];

        for (int i = 0; i < metro.length; i++) {
            metro[i] = random.nextInt(251);
        }

        for (int i = 0; i < metro.length; i++) {
            String cor;
            if (metro[i] < 51) {
                cor = "Verde";
            } else {
                if (metro[i] < 101) {
                    cor = "Amarela";
                } else {
                    if (metro[i] < 151) {
                        cor = "Laranja";
                    } else {
                        cor = "Vermelho";
                    }
                }
            }
            System.out.printf("Carro %2d - lotação: %-3d - %-8s\n", i+1, metro[i], cor);
        }
    }
}
