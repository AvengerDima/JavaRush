package Level_5.lvl_5_task_22;

public class Earth implements Planet {
  private static Earth instance;

  private Earth() {

  }

  public static synchronized Earth getInstance() {
    if (instance == null) {
      instance = new Earth();
    }
    return instance;
  }
}
