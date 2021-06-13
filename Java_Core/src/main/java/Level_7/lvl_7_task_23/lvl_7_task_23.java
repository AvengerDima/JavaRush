package Level_7.lvl_7_task_23;

/*
Ресторан
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_7_task_23 {
  public static List<Thread> threads = new ArrayList<>();

  public static void main(String[] args) throws Exception {
    Waiter waiterTarget = new Waiter();
    Thread waiter = new Thread(waiterTarget);
    threads.add(waiter);

    Cook cookTarget = new Cook();
    Thread cook = new Thread(cookTarget);
    threads.add(cook);

    waiter.start();
    cook.start();

    Thread.sleep(2000);
    cookTarget.continueWorking = false;
    Thread.sleep(500);
    waiterTarget.continueWorking = false;
  }
}
