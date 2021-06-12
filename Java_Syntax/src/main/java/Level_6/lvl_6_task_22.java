package Level_6;

/*
Числа по возрастанию
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class lvl_6_task_22 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[5];

    for (int i = 0; i < array.length; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }

    Arrays.sort(array);

    for (int i : array) {
      System.out.println(i);
    }
  }
}
