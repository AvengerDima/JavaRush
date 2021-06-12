package Level_8;

/*
HashMap из 10 пар
*/

import java.util.HashMap;
import java.util.Map;

public class lvl_8_task_2 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("арбуз", "ягода");
    map.put("банан", "трава");
    map.put("вишня", "ягода");
    map.put("груша", "фрукт");
    map.put("дыня", "овощ");
    map.put("ежевика", "куст");
    map.put("жень-шень", "корень");
    map.put("земляника", "ягода");
    map.put("ирис", "цветок");
    map.put("картофель", "клубень");

    for (Map.Entry<String, String> pair : map.entrySet()){
      String key = pair.getKey();
      String value = pair.getValue();
      System.out.println(key + " - " + value);
    }
  }
}
