package Level_7.lvl_7_task_6;

public class OurPresident {
  private static OurPresident president;

  private OurPresident() {
  }

  public static OurPresident getOurPresident() {
    return president;
  }

  static {
    synchronized (OurPresident.class) {
      president = new OurPresident();
    }
  }
}
