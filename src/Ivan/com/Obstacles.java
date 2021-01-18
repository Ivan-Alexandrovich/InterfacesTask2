package Ivan.com;

public class Obstacles {
    private int height;
    private int length;

    Obstacles (int height, int length) {
        this.height = height;
        this.length = length;
    }

    public int getLength () {
        return length;
    }

    public int getHeight () {
        return height;
    }
}
