package Level_4;

/*
НОД
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_20 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    long a = Long.parseLong(reader.readLine());
    if (a <= 0) throw new Exception();
    long b = Long.parseLong(reader.readLine());
    if (b <= 0) throw new Exception();
    System.out.println(gcd(a,b));
  }

  public static long gcd(long a, long b) {
    while (b != 0) {
      long tmp = a % b;
      a = b;
      b = tmp;
    }
    return a;
  }
}
