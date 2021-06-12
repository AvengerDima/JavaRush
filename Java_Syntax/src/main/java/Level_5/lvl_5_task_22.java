package Level_5;

/*
Максимум конструкторов
*/

public class lvl_5_task_22 {
  public double x;
  public double y;
  public double radius;

  //напишите тут ваш код
  public lvl_5_task_22(double x){
    this.x = x;
  }

  public lvl_5_task_22(double x, double y){
    this.x = x;
    this.y = y;
  }

  public lvl_5_task_22(double x, double y, double radius){
    this.x = x;
    this.y = y;
    this.radius = radius;
  }

  public lvl_5_task_22(){

    this(10, 5, 10);
  }

  public static void main(String[] args) {

  }
}
