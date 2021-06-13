package Level_6;

/*
Снова interrupt
*/

public class lvl_6_task_18 {
  public static void main(String[] args) throws InterruptedException {
    //Add your code here - добавь код тут
    TestThread testThread = new TestThread();
    testThread.start();
    testThread.interrupt();
  }

  //Add your code below - добавь код ниже
  public static class TestThread extends Thread {
    @Override
    public void run() {
      super.run();
    }
  }
}
