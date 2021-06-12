package Level_7;

/*
Общение одиноких массивов
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_7_task_3 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String[] list = new String[10];
    int[] numbers = new int[10];

    for (int i = 0; i < list.length; i++){
      list[i] = reader.readLine();
      numbers[i] = list[i].length();
    }

    for (int i = 0; i < list.length; i++){
      System.out.println(numbers[i]);
    }
  }
}
