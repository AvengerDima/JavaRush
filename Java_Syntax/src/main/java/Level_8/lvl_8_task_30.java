package Level_8;

/*
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_8_task_30 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String[] array = new String[20];
    for (int i = 0; i < array.length; i++) {
      array[i] = reader.readLine();
    }

    sort(array);

    for (String x : array) {
      System.out.println(x);
    }
  }

  public static void sort(String[] array) {
    //напишите тут ваш код
    String st = null;
    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (isGreaterThan(array[j], array[i])) {
          st = array[i];
          array[i] = array[j];
          array[j] = st;

        }
      }
    }
  }

  //Метод для сравнения строк: 'а' больше чем 'b'
  public static boolean isGreaterThan (String a, String b){
    return a.compareTo(b) > 0;
  }
}
