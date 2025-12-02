package arenas;

public class Arena {
    private int maxX, maxY;

    public Arena(int maxX, int maxY) {
        if (maxX <= 0 || maxY <= 0) {
            this.maxX = 100;
            this.maxY = 100;
        } else {
            this.maxX = maxX;
            this.maxY = maxY;
        }
    }

    public int getMaxX() {
        return maxX;
    }

    public int getMaxY() {
        return maxY;
    }
}
