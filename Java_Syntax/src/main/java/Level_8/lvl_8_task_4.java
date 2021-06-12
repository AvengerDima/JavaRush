package Level_8;

/*
Вывести на экран список ключей
*/

import java.util.HashMap;
import java.util.Map;

public class lvl_8_task_4 {
  public static void main(String[] args) throws Exception {
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("Sim", "Sim");
    map.put("Tom", "Tom");
    map.put("Arbus", "Arbus");
    map.put("Baby", "Baby");
    map.put("Cat", "Cat");
    map.put("Dog", "Dog");
    map.put("Eat", "Eat");
    map.put("Food", "Food");
    map.put("Gevey", "Gevey");
    map.put("Hugs", "Hugs");

    printKeys(map);
  }

  public static void printKeys(Map<String, String> map) {
    //напишите тут ваш код
    for (Map.Entry<String, String> pair : map.entrySet()){
      String key = pair.getKey();
      System.out.println(key);
    }
  }
}
