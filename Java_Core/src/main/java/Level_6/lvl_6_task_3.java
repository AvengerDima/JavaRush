package Level_6;

/*
Список и нити
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_6_task_3 {
  public static volatile List<Thread> list = new ArrayList<Thread>(5);

  public static void main(String[] args) {
    //Add your code here - добавьте свой код тут
    SpecialThread special1 = new SpecialThread();
    Thread thread1 = new Thread(special1);
    list.add(thread1);

    SpecialThread special2 = new SpecialThread();
    Thread thread2 = new Thread(special2);
    list.add(thread2);

    SpecialThread special3 = new SpecialThread();
    Thread thread3 = new Thread(special3);
    list.add(thread3);

    SpecialThread special4 = new SpecialThread();
    Thread thread4 = new Thread(special4);
    list.add(thread4);

    SpecialThread special5 = new SpecialThread();
    Thread thread5 = new Thread(special5);
    list.add(thread5);
  }

  public static class SpecialThread implements Runnable {
    public void run() {
      System.out.println("it's a run method inside SpecialThread");
    }
  }
}
