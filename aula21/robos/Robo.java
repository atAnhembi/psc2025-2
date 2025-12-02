package robos;

import arenas.Arena;

public class Robo {
    private int posX, posY;
    private Arena arena;

    public Robo(Arena arena) {
        this.arena = arena;
    }

    public Robo(int posX, int posY, Arena arena) {
        if (posX >= 0 && posY >= 0) {
            this.posX = posX;
            this.posY = posY;
        }
        this.arena = arena;
    }

    

    public String posicao() {
        return "[" + posX + "," + posY + "]";
    }

    public boolean moverNorte() {
        if(posX > 0){
            posX--;
            return true;
        }
        return false;
    }

    public boolean moverSul() {
        if(posX < arena.getMaxX()) {
           posX++;
           return true; 
        }
        return false;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

}
