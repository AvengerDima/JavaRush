package Level_1;

/*
Минимакс
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lvl_1_task_23 {
  public static void main(String[] args) {
    int[] data = new int[]{1, 2, 3, 5, -2, -8, 0, 77, 5, 5};

    Pair<Integer, Integer> result = getMinimumAndMaximum(data);

    System.out.println("The minimum is " + result.x);
    System.out.println("The maximum is " + result.y);
  }

  public static Pair<Integer, Integer> getMinimumAndMaximum(int[] inputArray) {
    if (inputArray == null || inputArray.length == 0) {
      return new Pair<Integer, Integer>(null, null);
    }

    // напишите тут ваш код
    List<Integer> list = new ArrayList<>();
    for (int i : inputArray) {
      list.add(i);
    }

    return new Pair<Integer, Integer>(Collections.min(list), Collections.max(list));
  }

  public static class Pair<X, Y> {
    public X x;
    public Y y;

    public Pair(X x, Y y) {
      this.x = x;
      this.y = y;
    }
  }
}
