package Level_7;

/*
Массив из строчек в обратном порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_7_task_2 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] list = new String[10];
    for(int i = 0; i < 8; i++){
      list[i] = reader.readLine();
    }

    for(int i = 0; i < list.length; i++){
      int m = list.length - i - 1;
      System.out.println(list[m]);
    }
  }
}
