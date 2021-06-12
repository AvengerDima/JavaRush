package Level_3;

/*
Всё, что движется
*/

public class lvl_3_task_9 {
  public static void main(String[] args) throws Exception {
  }

  interface CanMove {
    Double speed();
  }

  interface CanFly extends CanMove {
    Double speed(CanFly fly);
  }
}
