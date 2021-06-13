package Level_5.lvl_5_task_22;

public class Sun implements Planet {
  private static Sun instance;

  private Sun() {

  }

  public static synchronized Sun getInstance() {
    if (instance == null) {
      instance = new Sun();
    }
    return instance;
  }
}
