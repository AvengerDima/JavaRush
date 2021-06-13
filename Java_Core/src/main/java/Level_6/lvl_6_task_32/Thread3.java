package Level_6.lvl_6_task_32;

public class Thread3 extends Thread {
  @Override
  public void run() {
    while (!interrupted()) {
      try {
        System.out.println("Ура");
        Thread.sleep(500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
