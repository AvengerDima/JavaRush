package Level_5;

/*
Статики-2
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_5_task_15 {
  public static int A;
  public static int B;

  static {
    try {
      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String a = reader.readLine();
      String b = reader.readLine();
      A = Integer.parseInt(a);
      B = Integer.parseInt(b);
      reader.close();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static final int MIN = min(A, B);

  public static void main(String[] args) {
    System.out.println(MIN);
  }

  public static int min(int a, int b) {
    return a < b ? a : b;
  }
}
