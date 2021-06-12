package Level_10;

/*
Расставьте минимум static-ов
*/

public class lvl_10_task_14 {
  public int A = 5;
  public static int B = 5;
  public static int C = 5;
  public static int D = 5;

  public static void main(String[] args) {
    lvl_10_task_14 solution = new lvl_10_task_14();
    solution.A = 5;
    solution.B = 5 * B;
    solution.C = 5 * C * D;
    lvl_10_task_14.D = 5 * D * C;

    lvl_10_task_14.D = 5;
  }

  public int getA() {
    return A;
  }
}
