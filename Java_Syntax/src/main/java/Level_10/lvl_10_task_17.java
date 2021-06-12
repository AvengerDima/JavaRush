package Level_10;

/*
Безопасное извлечение из списка
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_10_task_17 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    ArrayList<Integer> list = new ArrayList<Integer>();
    for (int i = 0; i < 20; i++) {
      int x = Integer.parseInt(reader.readLine());
      list.add(x);
    }

    System.out.println(safeGetElement(list, 5, 1));
    System.out.println(safeGetElement(list, 20, 7));
    System.out.println(safeGetElement(list, -5, 9));
  }

  public static int safeGetElement(ArrayList<Integer> list, int index, int defaultValue) {
    //напишите тут ваш код
    int value;
    try
    {
      value = list.get(index);
    }
    catch (Exception e)
    {
      value = defaultValue;
    }
    return value;
  }
}
