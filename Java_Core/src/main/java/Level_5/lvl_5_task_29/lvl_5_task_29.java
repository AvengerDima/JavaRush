package Level_5.lvl_5_task_29;

/*
Осваивание статического блока
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_5_task_29 {
  public static void main(String[] args) {

  }

  static {
    //add your code here - добавьте код тут
    try {
      reset();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

  public static CanFly result;

  public static void reset() throws IOException {
    //add your code here - добавьте код тут
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String n = reader.readLine();

    if (n.equals("helicopter")) {
      lvl_5_task_29.result = new Helicopter();
    } else {
      lvl_5_task_29.result = new Plane(Integer.parseInt(reader.readLine()));
    }
    reader.close();
  }
}
