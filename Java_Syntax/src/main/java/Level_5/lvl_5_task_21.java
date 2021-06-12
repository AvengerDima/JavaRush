package Level_5;

/*
Вызов конструктора из конструктора
*/

public class lvl_5_task_21 {
  public double x;
  public double y;
  public double radius;

  public lvl_5_task_21(double x, double y, double radius) {
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public lvl_5_task_21(double x, double y) {
    //this.x = x;
    //this.y = y;
    //this.radius = 10;
    this(x, y, 10);

  }

  public lvl_5_task_21() {

    this(5, 5, 1);
  }

  public static void main(String[] args) {
    lvl_5_task_21 circle = new lvl_5_task_21();
    System.out.println(circle.x + " " + circle.y + " " + circle.radius);
    lvl_5_task_21 anotherCircle = new lvl_5_task_21(10, 5);
    System.out.println(anotherCircle.x + " " + anotherCircle.y + " " + anotherCircle.radius);
  }
}
