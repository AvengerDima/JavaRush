package Level_7;

/*
В убывающем порядке
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_7_task_28 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[20];
    for (int i = 0; i < 20; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }

    sort(array);

    for (int x : array) {
      System.out.println(x);
    }
  }

  public static void sort(int[] array) {
    for (int i = array.length - 1; i > 0; i--) {
      for (int j = 0; j < i; j++) {
        if (array[j] < array[j + 1]) {
          int a = array[j];
          array[j] = array[j + 1];
          array[j + 1] = a;
        }
      }
    }
  }
}
