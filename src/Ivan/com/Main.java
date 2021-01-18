package Ivan.com;

public class Main {

    public static void main(String[] args) {
        Teams[] teams = {new Human("Ivan", 2, 1000),
                new Cat("Barsik", 2, 500),
                new Robot(1, 3,1000)};

        Obstacles[] obstacles = {new Obstacles (2,500),
                new Obstacles(3,1000)};

        for (int i = 0; i < teams.length; i ++) {
            for (int j = 0; j < obstacles.length; j ++) {
                if ((teams[i].getLength() >= obstacles[j].getLength()) && (teams[i].getHeight() >= obstacles[j].getHeight())) {
                    System.out.println((j + 1) + " obstacle: ");
                    teams[i].jump(obstacles[j]);
                    teams[i].run(obstacles[j]);
                }
                else { break; }
            }
        }
    }
}
