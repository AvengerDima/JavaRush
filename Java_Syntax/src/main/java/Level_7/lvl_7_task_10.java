package Level_7;

/*
В начало списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_7_task_10 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<String>();

    for(int i = 0; i < 10; i++){
      list.add(0, reader.readLine());
    }

    for(int i = 0; i < list.size(); i++){
      System.out.println(list.get(i));
    }
  }
}
