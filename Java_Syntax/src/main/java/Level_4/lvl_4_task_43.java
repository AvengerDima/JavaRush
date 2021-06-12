package Level_4;

/*
Как назвали, так назвали
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_43 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name = reader.readLine();
    int y = Integer.parseInt(reader.readLine());
    int m = Integer.parseInt(reader.readLine());
    int d = Integer.parseInt(reader.readLine());

    System.out.println("Меня зовут " + name + ".");
    System.out.println("Я родился " + d + "." + m + "." + y);
  }
}
