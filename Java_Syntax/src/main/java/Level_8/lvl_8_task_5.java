package Level_8;

/*
На экране — значения!
*/

import java.util.HashMap;
import java.util.Map;

public class lvl_8_task_5 {
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

    printValues(map);
  }

  public static void printValues(Map<String, String> map) {
    //напишите тут ваш код
    for (Map.Entry<String, String> pair : map.entrySet()){
      String value = pair.getValue();
      System.out.println(value);
    }
  }
}
