import arenas.Arena;
import robos.Robo;
import robos.RoboTank;

public class Main {
    public static void main(String[] args) {
        Arena area = new Arena(250, 250);

        Robo robo = new RoboTank(50, 50, area);

        System.out.println(robo.posicao());

        if(robo.moverNorte()) {
            System.out.println("Andou para o Norte");
        } else {
            System.out.println("Nâo foi possível andar para o Norte");
        }

        if(robo.moverSul()) {
            System.out.println("Andou para o sUL");
        } else {
            System.out.println("Nâo foi possível andar para o Sul");
        }

        System.out.println(robo.posicao());

    }
}
