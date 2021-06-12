package Level_8;

/*
Коллекция HashMap из Object
*/

import java.util.HashMap;
import java.util.Map;

public class lvl_8_task_6 {
  public static void main(String[] args) throws Exception {
    HashMap<String, Object> map = new HashMap<String, Object>();
    map.put("Sim", 5);
    map.put("Tom", 5.5);
    map.put("Arbus", false);
    map.put("Baby", null);
    map.put("Cat", "Cat");
    map.put("Eat", new Long(56));
    map.put("Food", new Character('3'));
    map.put("Gevey", '6');
    map.put("Hugs", 111111111111L);
    map.put("Comp", (double) 123);

    //напишите тут ваш код
    for (Map.Entry<String, Object> pair : map.entrySet()){
      String key = pair.getKey();
      Object value = pair.getValue();
      System.out.println(key + " - " + value);
    }
  }
}
