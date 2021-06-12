package Level_4.lvl_4_task_21;

public class Singleton {
  private static final Singleton instance = new Singleton();

  public static Singleton getInstance() {
    return instance;
  }

  private Singleton() {

  }
}
