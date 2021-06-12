package Level_7;

/*
Вывести числа в обратном порядке
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_7_task_19 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<Integer>();

    for (int i = 0; i < 10; i++){
      int s = Integer.parseInt(reader.readLine());
      list.add(s);
    }

    for (int i = 0; i < list.size(); i++){
      int j = list.size() - i - 1;
      System.out.println(list.get(j));
    }
  }
}
