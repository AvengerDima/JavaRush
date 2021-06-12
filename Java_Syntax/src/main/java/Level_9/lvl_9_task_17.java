package Level_9;

/*
Перехват unchecked-исключений
*/

public class lvl_9_task_17 {
  public static void main(String[] args) {
    handleExceptions(new lvl_9_task_17());
  }

  public static void handleExceptions(lvl_9_task_17 obj) {
    try {
      obj.method1();
      obj.method2();
      obj.method3();
    }
    catch (RuntimeException e){
      printStack(e);
    }
  }

  public static void printStack(Throwable throwable) {
    System.out.println(throwable);
    for (StackTraceElement element : throwable.getStackTrace()) {
      System.out.println(element);
    }
  }

  public void method1() {
    throw new NullPointerException();
  }

  public void method2() {
    throw new IndexOutOfBoundsException();
  }

  public void method3() {
    throw new NumberFormatException();
  }
}
