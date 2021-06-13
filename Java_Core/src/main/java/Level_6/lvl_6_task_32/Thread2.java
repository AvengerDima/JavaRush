package Level_6.lvl_6_task_32;

public class Thread2 extends Thread {
  @Override
  public void run() {
    try {
      Thread.sleep(1000);
    } catch (InterruptedException e) {
      System.out.println("InterruptedException");
    }
  }
}
