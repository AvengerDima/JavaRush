package Level_8;

/*
Модернизация ПО
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class lvl_8_task_29 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    // List of addresses
    HashMap<String, String> map = new HashMap<String, String>();
    while (true) {
      String city = reader.readLine();
      if (city.isEmpty())
        break;
      else {
        String lastName = reader.readLine();
        map.put(city, lastName);
      }
    }

    // Read the house number
    String cityKey = reader.readLine();

    for (HashMap.Entry<String, String> pair : map.entrySet()) {
      if (pair.getKey().equals(cityKey)){
        System.out.println(pair.getValue());
      }
    }
  }
}
