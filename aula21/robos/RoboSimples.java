package robos;

import arenas.Arena;

public class RoboSimples extends Robo {

    public RoboSimples (Arena arena) {
        super(arena);
    }

    public RoboSimples (int posX, int posY, Arena arena) {
        super(posX, posY, arena);
    }

    public boolean moverNorte() {
        if(getPosX() > 1){
            setPosX(getPosX() - 2);
            return true;
        }
        return false;
    }
}
