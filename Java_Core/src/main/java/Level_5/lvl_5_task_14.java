package Level_5;

/*
Статики-1
*/

import java.util.HashMap;
import java.util.Map;

public class lvl_5_task_14 {
  public static Map<Double, String> labels = new HashMap<Double, String>();

  static {
    labels.put((double) 1, "1");
    labels.put((double) 2, "2");
    labels.put((double) 3, "3");
    labels.put((double) 4, "4");
    labels.put((double) 5, "5");
  }

  public static void main(String[] args) {
    System.out.println(labels);
  }
}
