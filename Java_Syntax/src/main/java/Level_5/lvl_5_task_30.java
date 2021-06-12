package Level_5;

/*
Шеф, что-то не пашет
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_5_task_30 {
  public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());

    int sum = a + b;
    System.out.println("Sum = " + sum);
  }
}
