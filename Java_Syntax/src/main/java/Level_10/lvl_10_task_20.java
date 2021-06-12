package Level_10;

/*
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_10_task_20 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int[] array = new int[30];
    for (int i = 0; i < 30; i++) {
      array[i] = Integer.parseInt(reader.readLine());
    }

    sort(array);

    System.out.println(array[9]);
    System.out.println(array[10]);
  }

  public static void sort(int[] array) {
    //напишите тут ваш код
    for (int i=1;i<array.length;i++) {
      int current = array[i];
      int previous = i-1;
      while(previous>=0 && array[previous]>current) {
        array[previous+1] = array[previous];
        array[previous]=current;
        previous--;
      }
    }
  }
}
