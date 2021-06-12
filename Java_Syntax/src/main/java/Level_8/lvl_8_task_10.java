package Level_8;

/*
Время для 10 тысяч вызовов get
*/

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class lvl_8_task_10 {
  public static void main(String[] args) {
    System.out.println(getGetTimeInMs(fill(new ArrayList())));
    System.out.println(getGetTimeInMs(fill(new LinkedList())));
  }

  public static List fill(List list) {
    for (int i = 0; i < 10000; i++) {
      list.add(new Object());
    }
    return list;
  }

  public static long getGetTimeInMs(List list) {
    // напишите тут ваш код
    Date currentTime = new Date();
    get10000(list);

    // напишите тут ваш код
    Date newTime = new Date();
    long msDelay = newTime.getTime() - currentTime.getTime();
    return msDelay;
  }

  public static void get10000(List list) {
    if (list.isEmpty()) return;
    int x = list.size() / 2;

    for (int i = 0; i < 10000; i++) {
      list.get(x);
    }
  }
}
