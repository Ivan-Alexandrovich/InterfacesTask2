package Ivan.com;

public class Cat implements Run, Jump, Teams {
    private String name;
    private int height;
    private int length;

    Cat (String name, int height, int length) {
        this.name = name;
        this.height = height;
        this.length = length;
    }

    @Override
    public void jump(Obstacles obstacles) {
        if (this.height >= obstacles.getHeight()) {
            System.out.println("Cat " + this.name + " has jumped over the wall");
        }
        else {
            System.out.println(this.name + " is not able to jump over the wall");
        }
    }

    @Override
    public void run(Obstacles obstacles) {
        if (length >= obstacles.getLength()) {
            System.out.println(this.name + " has run over the treadmill");
        }
        else {
            System.out.println(this.name + " is not able to run the distance");
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
