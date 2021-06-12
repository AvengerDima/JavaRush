package Level_8;

/*
Номер месяца
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class lvl_8_task_28 {
  public static void main(String[] args) throws IOException {
    //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String monthName = reader.readLine();

    HashMap<String, Integer> map = new HashMap<String, Integer>();
    map.put("January", 1);
    map.put("February", 2);
    map.put("March", 3);
    map.put("April", 4);
    map.put("May", 5);
    map.put("June", 6);
    map.put("July", 7);
    map.put("August", 8);
    map.put("September", 9);
    map.put("October", 10);
    map.put("November", 11);
    map.put("December", 12);

    for (Map.Entry<String, Integer> pair : map.entrySet())
    {
      if (pair.getKey().contains(monthName))
      {
        System.out.println(monthName + " is the " + pair.getValue() + " month");
      }
    }
  }
}
