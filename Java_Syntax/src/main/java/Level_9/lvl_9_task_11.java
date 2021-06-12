package Level_9;

/*
Исключение при работе с коллекциями Map
*/

import java.util.HashMap;

public class lvl_9_task_11 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    try {
      HashMap<String, String> map = new HashMap<String, String>(null);
      map.put(null, null);
      map.remove(null);
    }
    catch (NullPointerException e) {
      System.out.println(e);
    }
    //напишите тут ваш код
  }
}
