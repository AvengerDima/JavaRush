package Level_9;

/*
Исключения. Просто исключения.
*/

import java.io.FileNotFoundException;
import java.net.URISyntaxException;

public class lvl_9_task_13 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    try {
      method1();
    }
    catch (NullPointerException | FileNotFoundException e) {
      System.out.println(e);
    }
    //напишите тут ваш код
  }

  public static void method1() throws NullPointerException, ArithmeticException, FileNotFoundException, URISyntaxException {
    int i = (int) (Math.random() * 4);
    if (i == 0)
      throw new NullPointerException();
    if (i == 1)
      throw new ArithmeticException();
    if (i == 2)
      throw new FileNotFoundException();
    if (i == 3)
      throw new URISyntaxException("", "");
  }
}
