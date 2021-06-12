package Level_2;

/*
Считаем длину окружности
*/

public class lvl_2_task_6 {
  public static void main(String[] args) {

    printCircleLength(5);
  }

  public static void printCircleLength(int radius) {

    double L = 2 * 3.14 * radius;
    System.out.println(L);
  }
}
