package Level_10;

/*
Поправочки нужны
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

public class lvl_10_task_18 {
  HashMap<Integer, String> map;
  static Integer index;
  static String name;

  public lvl_10_task_18() {
    this.map = new HashMap<Integer, String>();
    //map.put(index, name);
  }

  public static void main(String[] args) throws IOException {
    lvl_10_task_18 solution = new lvl_10_task_18();
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    for (int i = 0; i < 10; i++) {
      int index = Integer.parseInt(reader.readLine());
      String name = reader.readLine();
      solution.map.put(index, name);
    }

    for (Map.Entry<Integer, String> pair : solution.map.entrySet()) {
      index = pair.getKey();
      name = pair.getValue();
      System.out.println("Id=" + index + " Name=" + name);
    }
  }
}
