package Level_7;

/*
Перестановочка подоспела
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_7_task_20 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<String>();

    int N = Integer.parseInt(reader.readLine());
    int M = Integer.parseInt(reader.readLine());

    for (int i = 0; i < N; i++) {
      list.add(reader.readLine());
    }

    for (int i = 0; i < M;) {
      list.add(list.get(i));
      list.remove(i);
      M--;
    }

    for (int i = 0; i < list.size(); i++) {
      System.out.println(list.get(i));
    }
  }
}
