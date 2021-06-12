package Level_7;

/*
Переверни массив
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_7_task_4 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int[] numbers = new int[10];

    for (int i = 0; i < numbers.length; i++){
      numbers[i] = Integer.parseInt(reader.readLine());
    }

    for (int i = 0; i < numbers.length; i++){
      int k = numbers.length - i - 1;
      System.out.println(numbers[k]);
    }
  }
}
