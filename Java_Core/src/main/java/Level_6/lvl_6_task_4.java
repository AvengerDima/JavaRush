package Level_6;

/*
Вывод стек-трейса
*/

public class lvl_6_task_4 {
  public static void main(String[] args) throws InterruptedException {
    Thread thread = new Thread(new SpecialThread());
    thread.start();

    System.out.println("*****************");

    for (StackTraceElement element : Thread.currentThread().getStackTrace()) {
      System.out.println(element);
    }
  }

  public static class SpecialThread implements Runnable {
    @Override
    public void run() {
      StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

      for (StackTraceElement element : stackTraceElements) {
        System.out.println(element);
      }
    }
  }
}
