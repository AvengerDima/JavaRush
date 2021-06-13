package Level_6;

/*
А без interrupt слабо?
*/

public class lvl_6_task_19 {
  public static boolean isTestRun = true;

  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread(new TestThread());
    t.start();
    Thread.sleep(3000);
    ourInterruptMethod();
  }

  public static void ourInterruptMethod() {
    isTestRun = false;
  }

  public static class TestThread implements Runnable {
    public void run() {
      while (isTestRun == true) {
        try {
          System.out.println("he-he");
          Thread.sleep(500);
        } catch (InterruptedException e) {
        }

        if (!lvl_6_task_19.isTestRun)
          return;
      }
    }
  }
}
