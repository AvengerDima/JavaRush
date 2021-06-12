package Level_8;

/*
Только для богачей
*/

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class lvl_8_task_18 {
  public static HashMap<String, Integer> createMap() {
    //напишите тут ваш код
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("Kolegov", 5000);
    map.put("Dronov", 4000);
    map.put("Kovalev", 3000);
    map.put("Urgaliev", 2000);
    map.put("Vodniy", 1000);
    map.put("Kucher", 800);
    map.put("Grivina", 600);
    map.put("Korolev", 400);
    map.put("Torchin", 200);
    map.put("Hulk", 100);

    return map;
  }

  public static void removeItemFromMap(HashMap<String, Integer> map) {
    //напишите тут ваш код
    Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()){
      Map.Entry<String, Integer> pair = iterator.next();
      String key = pair.getKey();
      Integer value = pair.getValue();
      if (value < 500){
        iterator.remove();;
      }
    }
  }

  public static void main(String[] args) {

  }
}
