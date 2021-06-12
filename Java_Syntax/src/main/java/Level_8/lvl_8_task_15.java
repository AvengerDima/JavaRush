package Level_8;

/*
Перепись населения
*/

import java.util.HashMap;
import java.util.Map;

public class lvl_8_task_15 {
  public static HashMap<String, String> createMap() {
    //напишите тут ваш код
    HashMap<String, String> map = new HashMap<String, String>();
    map.put("Zdanovich", "Petr");
    map.put("Petrov", "Dmitry");
    map.put("Galishev", "Kostantin");
    map.put("Medvedev", "Ivan");
    map.put("Grovin", "Dmitry");
    map.put("Guliver", "Evgeniy");
    map.put("Morozov", "Artem");
    map.put("Porteh", "Dmitry");
    map.put("Tokin", "Artem");
    map.put("Kolin", "Vitaliy");

    return map;
  }

  public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
    //напишите тут ваш код
    int countName = 0;
    for (Map.Entry<String, String> mapName : map.entrySet()){
      if (mapName.getValue().equals(name)){
        countName++;
      }
    }

    return countName;
  }

  public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {
    //напишите тут ваш код
    int countLastName = 0;
    for (Map.Entry<String, String> mapLastName : map.entrySet()){
      if (mapLastName.getKey().equals(lastName)){
        countLastName++;
      }
    }

    return countLastName;
  }

  public static void main(String[] args) {

  }
}
