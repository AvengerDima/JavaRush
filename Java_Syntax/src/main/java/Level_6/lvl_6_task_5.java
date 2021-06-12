package Level_6;

/*
Чётные и нечётные циферки
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_6_task_5 {
  public static int even;
  public static int odd;

  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int n = Integer.parseInt(reader.readLine());

    while(n > 0) {
      if (n % 2 == 0) {
        even++;
      } else {
        odd++;
      }
      n = n / 10;
    }
    System.out.println("Even: " + even + " Odd: " + odd);
  }
}
