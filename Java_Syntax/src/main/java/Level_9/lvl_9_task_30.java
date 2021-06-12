package Level_9;

/*
Задача по алгоритмам
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_9_task_30 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<String> list = new ArrayList<>();
    while (true) {
      String s = reader.readLine();
      if (s.isEmpty()) break;
      list.add(s);
    }

    String[] array = list.toArray(new String[0]);
    sort(array);

    for (String x : array) {
      System.out.println(x);
    }
  }

  public static void sort(String[] array) {
    // напишите тут ваш код
    String st = null;
    int num1 = Integer.MIN_VALUE;
    int num2 = Integer.MIN_VALUE;

    for (int i = 0; i < array.length; i++) {
      for (int j = 0; j < array.length; j++) {
        if (isGreaterThan(array[j], array[i]))
        {
          if (!isNumber(array[i]))
          {
            st = array[i];
            array[i] = array[j];
            array[j] = st;
          }
        }

        if (isNumber(array[i]) && isNumber(array[j]))
        {
          num1 = Integer.parseInt(array[i]);
          num2 = Integer.parseInt(array[j]);
          if (num1>num2)
          {
            st = array[j];
            array[j] = array[i];
            array[i] = st;
          }
        }
      }
    }
  }

  // Метод для сравнения строк: 'а' больше чем 'b'
  public static boolean isGreaterThan(String a, String b) {
    return a.compareTo(b) > 0;
  }


  // Переданная строка - это число?
  public static boolean isNumber(String s) {
    if (s.length() == 0) return false;

    char[] chars = s.toCharArray();
    for (int i = 0; i < chars.length; i++) {
      char c = chars[i];
      if ((i != 0 && c == '-') // Строка содержит '-'
              || (!Character.isDigit(c) && c != '-') // или не цифра и не начинается с '-'
              || (chars.length == 1 && c == '-')) // или одиночный '-'
      {
        return false;
      }
    }
    return true;
  }
}
