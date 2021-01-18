package Ivan.com;

public class Robot implements Run, Jump, Teams {
    private int id;
    private int height;
    private int length;

    Robot(int id, int height, int length) {
        this.id = id;
        this.height = height;
        this.length = length;
    }

    @Override
    public void jump(Obstacles obstacles) {
        if (this.height >= obstacles.getHeight()) {
            System.out.println("Robot " + this.id + " has jumped over the wall");
        }
        else {
            System.out.println("Robot " + this.id + " is not able to jump over the wall");
        }
    }

    @Override
    public void run(Obstacles obstacles) {
        if (length >= obstacles.getLength()) {
            System.out.println("Robot " + this.id + " has run over the treadmill");
        }
        else {
            System.out.println("Robot " + this.id + " is not able to run the distance");
        }
    }

    @Override
    public int getLength() {
        return length;
    }

    @Override
    public int getHeight() {
        return height;
    }
}
