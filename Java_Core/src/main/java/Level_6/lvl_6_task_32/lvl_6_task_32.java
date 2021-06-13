package Level_6.lvl_6_task_32;

/*
Клубок
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_6_task_32 {
  public static List<Thread> threads = new ArrayList<>(5);

  static {
    threads.add(new Thread1());
    threads.add(new Thread2());
    threads.add(new Thread3());
    threads.add(new Thread4());
    threads.add(new Thread5());
  }

  public static void main(String[] args) {
  }
}
