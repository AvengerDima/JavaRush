package Level_6.lvl_6_task_32;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Thread5 extends Thread {
  @Override
  public void run() {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String n = "";
    Integer n1;
    int sum = 0;

    while (!n.equals("N")) {
      try {
        n = reader.readLine();
        n1 = Integer.parseInt(n);
        sum += n1;
      } catch (Exception e) {

      }
    }

    System.out.println(sum);
  }
}
