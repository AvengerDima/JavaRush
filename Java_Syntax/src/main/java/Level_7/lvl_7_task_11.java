package Level_7;

/*
Удалить и вставить
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_7_task_11 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<String> list = new ArrayList<String>();

    for(int i = 0; i < 5; i++){
      list.add(reader.readLine());
    }

    for(int i = 0; i < 13; i++){
      list.add(0, list.remove(list.size() - 1));
    }

    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
