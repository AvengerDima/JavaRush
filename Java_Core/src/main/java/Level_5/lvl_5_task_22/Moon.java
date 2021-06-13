package Level_5.lvl_5_task_22;

public class Moon implements Planet {
  private static Moon instance;

  private Moon() {

  }

  public static synchronized Moon getInstance() {
    if (instance == null) {
      instance = new Moon();
    }
    return instance;
  }
}
