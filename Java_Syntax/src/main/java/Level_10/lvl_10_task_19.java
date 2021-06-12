package Level_10;

/*
Функциональности маловато!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class lvl_10_task_19 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Integer> map = new HashMap<>();

    int id = 0;
    String name = "";
    while (true) {
      try {
        id = Integer.parseInt(reader.readLine());
        name = reader.readLine();
        map.put(name, id);
      } catch (NumberFormatException e) {
        break;
      }
    }

    for (Map.Entry<String, Integer> pair : map.entrySet())
      System.out.println(pair.getValue() + " " + pair.getKey());
  }
}
