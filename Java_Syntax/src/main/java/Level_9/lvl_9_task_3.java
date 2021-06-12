package Level_9;

/*
Кто меня вызывал?
*/

public class lvl_9_task_3 {
  public static void main(String[] args) throws Exception {
    method1();
  }

  public static int method1() {
    method2();
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

    return stackTraceElements[2].getLineNumber();
  }

  public static int method2() {
    method3();
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

    return stackTraceElements[2].getLineNumber();
  }

  public static int method3() {
    method4();
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

    return stackTraceElements[2].getLineNumber();
  }

  public static int method4() {
    method5();
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

    return stackTraceElements[2].getLineNumber();
  }

  public static int method5() {
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

    return stackTraceElements[2].getLineNumber();
  }
}
