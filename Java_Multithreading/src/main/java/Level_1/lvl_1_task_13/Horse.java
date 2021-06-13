package Level_1.lvl_1_task_13;

public class Horse {
    public String name;
    public double speed;
    public double distance;

    public Horse(String name, double speed, double distance) {
        this.name = name;
        this.speed = speed;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDistance() {
        return distance;
    }

    public void setDistance(double distance) {
        this.distance = distance;
    }

    public void move() { //Управляем движением всех лошадей
        distance += Math.random() * speed;
    }

    public void print() { //Отрисовываем объекты на экран
        String dot = ".";
        for (int i = 1; i < Math.floor(distance); i++) {
            dot = dot.concat(".");
        }
        System.out.println(dot + name);
    }

    public static void main(String[] args) {

    }
}
