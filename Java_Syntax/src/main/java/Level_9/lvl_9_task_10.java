package Level_9;

/*
Исключение при работе с коллекциями List
*/

import java.util.ArrayList;

public class lvl_9_task_10 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    try {
      ArrayList<String> list = new ArrayList<String>();
      String s = list.get(18);
    }
    catch (IndexOutOfBoundsException e) {
      System.out.println(e);
    }
    //напишите тут ваш код
  }
}
