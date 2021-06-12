package Level_6;

/*
Расстояние между двумя точками
*/

public class lvl_6_task_9 {
  public static double getDistance(int x1, int y1, int x2, int y2) {
    double a = Math.sqrt((x2 - x1)*(x2 - x1) + (y2 - y1)*(y2 - y1));
    return a;
  }

  public static void main(String[] args) {

  }
}
