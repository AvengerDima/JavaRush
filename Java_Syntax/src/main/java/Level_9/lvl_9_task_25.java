package Level_9;

/*
Статики не на своем месте
*/

public class lvl_9_task_25 {
  public static int A = 5;
  public static int B = 2 * A;
  public int C = A * B;
  public static int D = A * B;

  public static void main(String[] args) {
    lvl_9_task_25 room = new lvl_9_task_25();
    room.A = 5;

    lvl_9_task_25.D = 5;
  }

  public int getA() {
    return A;
  }

}
