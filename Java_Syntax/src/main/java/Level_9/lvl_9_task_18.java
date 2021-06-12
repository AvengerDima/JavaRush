package Level_9;

/*
Все свои, даже исключения
*/

import java.io.FileNotFoundException;
import java.io.IOException;

public class lvl_9_task_18 {
  public static void main(String[] args) {
  }

  static class MyException extends FileNotFoundException {
  }

  static class MyException2 extends IOException {
  }

  static class MyException3 extends RuntimeException {
  }

  static class MyException4 extends ArithmeticException {
  }
}
