package Level_7;

/*
Проверка на упорядоченность
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_7_task_18 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<>(10);
    for (int i = 0; i < 10; i++) {
      list.add(reader.readLine());
    }
    for (int i = 0; i < list.size() - 1; i++)
      if (list.get(i + 1).length() < list.get(i).length()) {
        System.out.println(i + 1);
        break;
      }
    reader.close();
  }
}
