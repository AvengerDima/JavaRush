package Level_8;

/*
Нам повторы не нужны
*/

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class lvl_8_task_17 {
  public static HashMap<String, String> createMap() {
    //напишите тут ваш код
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("Kavilov", "Petr");
    map.put("Petrov", "Dmitry");
    map.put("Galishev", "Kostantin");
    map.put("Modov", "Ivan");
    map.put("Grovin", "Dmitry");
    map.put("Guliver", "Evgeniy");
    map.put("Morozov", "Artem");
    map.put("Porteh", "Dmitry");
    map.put("Tokin", "Artem");
    map.put("Kolin", "Petr");

    return map;
  }

  public static void removeTheFirstNameDuplicates(Map<String, String> map) {
    //напишите тут ваш код
    List valueList = new ArrayList(map.values());
    for(int i = 0; i < valueList.size() - 1 ; i++) {
      for(int j = i + 1; j < valueList.size(); j++) {
        if (valueList.get(i).equals(valueList.get(j))) {
          removeItemFromMapByValue(map, (String) valueList.get(i));
        }
      }
    }
  }

  public static void removeItemFromMapByValue(Map<String, String> map, String value) {
    HashMap<String, String> copy = new HashMap<String, String>(map);
    for (Map.Entry<String, String> pair : copy.entrySet()) {
      if (pair.getValue().equals(value))
        map.remove(pair.getKey());
    }
  }

  public static void main(String[] args) {

  }
}
