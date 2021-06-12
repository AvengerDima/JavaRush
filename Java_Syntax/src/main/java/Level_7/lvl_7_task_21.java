package Level_7;

/*
Минимаксы в массивах
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_7_task_21 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] list = new int[20];

    for (int i = 0; i < 20; i++){
      list[i] = Integer.parseInt(reader.readLine());
    }

    int maximum = list[0];
    int minimum = list[0];
    for (int i = 0; i < list.length; i++){
      if(maximum < list[i]){
        maximum = list[i];
      }
      if(minimum > list[i]){
        minimum = list[i];
      }
    }

    System.out.print(maximum + " " + minimum);
  }
}
