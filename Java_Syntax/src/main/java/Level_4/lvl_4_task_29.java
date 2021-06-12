package Level_4;

/*
Положительные и отрицательные числа
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_29 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(reader.readLine());
    int b = Integer.parseInt(reader.readLine());
    int c = Integer.parseInt(reader.readLine());

    int x = 0;
    int y = 0;

    if(a < 0) {
      x += 1;
    }
    if(b < 0) {
      x += 1;
    }
    if(c < 0) {
      x += 1;
    }
    System.out.println("количество отрицательных чисел: " + x);

    if(a > 0) {
      y += 1;
    }
    if(b > 0) {
      y += 1;
    }
    if(c > 0) {
      y += 1;
    }
    System.out.println("количество положительных чисел: " + y);
  }
}
