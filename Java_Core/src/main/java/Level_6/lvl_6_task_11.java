package Level_6;

/*
Часы
*/

public class lvl_6_task_11 {
  public static volatile boolean isStopped = false;

  public static void main(String[] args) throws InterruptedException {
    Clock clock = new Clock();
    Thread.sleep(2000);
    isStopped = true;
    System.out.println("The clock has to be stopped");
    Thread.sleep(2000);
    System.out.println("Double-check");
  }

  public static class Clock extends Thread {
    public Clock() {
      setPriority(MAX_PRIORITY);
      start();
    }

    public void run() {
      try {
        while (!isStopped) {
          printTikTak();
        }
      } catch (InterruptedException e) {
      }
    }

    private void printTikTak() throws InterruptedException {
      //add your code here - добавь код тут
      Thread.sleep(500);
      System.out.println("Tik");
      Thread.sleep(500);
      System.out.println("Tak");
    }
  }
}
