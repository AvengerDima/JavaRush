package Level_4;

/*
Нашествие исключений
*/

import java.io.IOException;
import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;
import java.util.concurrent.TimeoutException;

public class lvl_4_task_19 {
  public static List<Exception> exceptions = new ArrayList<Exception>();

  public static void main(String[] args) {
    initExceptions();

    for (Exception exception : exceptions) {
      System.out.println(exception);
    }
  }

  private static void initExceptions() {   //the first exception
    try {
      float i = 1 / 0;

    } catch (Exception e) {
      exceptions.add(e);
    }

    //напишите тут ваш код
    exceptions.add(new IOException());
    exceptions.add(new EmptyStackException());
    exceptions.add(new ClassCastException());
    exceptions.add(new ClassNotFoundException());
    exceptions.add(new RuntimeException());
    exceptions.add(new TimeoutException());
    exceptions.add(new InterruptedException());
    exceptions.add(new NullPointerException());
    exceptions.add(new ArrayIndexOutOfBoundsException());
  }
}
