package Level_6;

/*
Последовательные выполнения нитей
*/

public class lvl_6_task_22 {
  public volatile static int COUNT = 4;

  public static void main(String[] args) throws InterruptedException {
    for (int i = 0; i < COUNT; i++) {
      new SleepingThread().join();
      //напишите тут ваш код
    }
  }

  public static class SleepingThread extends Thread {
    private static volatile int threadCount = 0;
    private volatile int countdownIndex = COUNT;

    public SleepingThread() {
      super(String.valueOf(++threadCount));
      start();
    }

    public void run() {
      while (true) {
        System.out.println(this);
        if (--countdownIndex == 0) return;
        //напишите тут ваш код
        try {
          Thread.sleep(10);
        } catch (InterruptedException e) {
          System.out.println("Нить прервана");
          e.printStackTrace();
        }
      }
    }

    public String toString() {
      return "#" + getName() + ": " + countdownIndex;
    }
  }
}
