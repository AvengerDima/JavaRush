package Level_9;

/*
И снова StackTrace
*/

public class lvl_9_task_2 {
  public static void main(String[] args) throws Exception {
    method1();
  }

  public static String method1() {
    method2();
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements){
      System.out.println(element.getMethodName());
    }
    return stackTraceElements[2].getMethodName();
  }

  public static String method2() {
    method3();
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements){
      System.out.println(element.getMethodName());
    }
    return stackTraceElements[2].getMethodName();
  }

  public static String method3() {
    method4();
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements){
      System.out.println(element.getMethodName());
    }
    return stackTraceElements[2].getMethodName();
  }

  public static String method4() {
    method5();
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements){
      System.out.println(element.getMethodName());
    }
    return stackTraceElements[2].getMethodName();
  }

  public static String method5() {
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements){
      System.out.println(element.getMethodName());
    }
    return stackTraceElements[2].getMethodName();
  }
}
