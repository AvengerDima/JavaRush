package Level_7;

/*
Слова в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_7_task_14 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<String>();

    for(int i = 0; i < 5; i++){
      String s = reader.readLine();
      list.add(s);
    }

    list.remove(2);

    for(int i = 0; i < list.size(); i++){
      int j = list.size() - i - 1;
      System.out.println(list.get(j));
    }
  }
}
