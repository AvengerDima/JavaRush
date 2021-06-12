package Level_4.lvl_4_task_9;

/*
Мосты
*/

public class lvl_4_task_9 {
  public static void main(String[] args) {
    println(new WaterBridge());
    println(new SuspensionBridge());
  }

  //add println method here
  public static void println(Bridge bridge) {
    System.out.println(bridge.getCarsCount());
  }
}
