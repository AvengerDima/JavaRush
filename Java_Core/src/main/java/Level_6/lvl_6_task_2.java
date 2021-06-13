package Level_6;

/*
My second thread
*/

public class lvl_6_task_2 {
  public static void main(String[] args) {
    TestThread thread = new TestThread();
    thread.start();
  }

  public static class TestThread extends Thread {
    @Override
    public void run() {
      System.out.println("it's a run method");
    }

    static {
      System.out.println("it's a static block inside TestThread");
    }
  }
}
