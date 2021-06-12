package Level_9;

/*
Возвращаем StackTrace
*/

public class lvl_9_task_1 {
  public static void main(String[] args) throws Exception {
    method1();
  }

  public static StackTraceElement[] method1() {
    method2();
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements){
      System.out.println(element.getMethodName());
    }
    return stackTraceElements;
  }

  public static StackTraceElement[] method2() {
    method3();
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements){
      System.out.println(element.getMethodName());
    }
    return stackTraceElements;
  }

  public static StackTraceElement[] method3() {
    method4();
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements){
      System.out.println(element.getMethodName());
    }
    return stackTraceElements;
  }

  public static StackTraceElement[] method4() {
    method5();
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements){
      System.out.println(element.getMethodName());
    }
    return stackTraceElements;
  }

  public static StackTraceElement[] method5() {
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    for (StackTraceElement element : stackTraceElements){
      System.out.println(element.getMethodName());
    }
    return stackTraceElements;
  }
}
