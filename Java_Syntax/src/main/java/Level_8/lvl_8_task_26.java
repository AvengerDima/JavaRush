package Level_8;

/*
Пять победителей
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_8_task_26 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[20];
    for (int i = 0; i < array.length; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }

    sort(array);

    System.out.println(array[0]);
    System.out.println(array[1]);
    System.out.println(array[2]);
    System.out.println(array[3]);
    System.out.println(array[4]);
  }

  public static void sort(int[] array) {
    //напишите тут ваш код
    int[] maxFiveNumbers = new int[20];

    int max = Integer.MIN_VALUE;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length ; j++) {
        if(array[i]>array[j])
        {
          max = array[i];
          array[i] = array[j];
          array[j] = max;

        }
      }
    }
  }
}
