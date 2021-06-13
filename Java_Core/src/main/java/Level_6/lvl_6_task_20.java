package Level_6;

/*
Один для всех, все - для одного
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_6_task_20 {
  public static byte threadCount = 3;
  static List<Thread> threads = new ArrayList<Thread>(threadCount);

  public static void main(String[] args) throws InterruptedException {
    initThreadsAndStart();
    Thread.sleep(3000);
    ourInterruptMethod();
  }

  public static void ourInterruptMethod() {
    //add your code here - добавь код тут
    for (Thread x : threads) {
      x.interrupt();
    }
  }

  private static void initThreadsAndStart() {
    Water water = new Water("water");
    for (int i = 0; i < threadCount; i++) {
      threads.add(new Thread(water, "#" + i));
    }

    for (int i = 0; i < threadCount; i++) {
      threads.get(i).start();
    }
  }

  public static class Water implements Runnable {
    private String sharedResource;

    public Water(String sharedResource) {
      this.sharedResource = sharedResource;
    }

    public void run() {
      //fix 2 variables - исправь 2 переменных
      Thread currentThread = Thread.currentThread();
      boolean isCurrentThreadInterrupted = currentThread.isInterrupted();
      String threadName = currentThread.getName();

      try {
        while (!isCurrentThreadInterrupted) {

          System.out.println("Объект " + sharedResource + ", нить " + threadName);
          Thread.sleep(1000);
        }
      } catch (InterruptedException e) {
      }
    }
  }
}
