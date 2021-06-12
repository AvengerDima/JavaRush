package Level_9;

/*
Логирование стек-трейса
*/

public class lvl_9_task_6 {
  public static void main(String[] args) {
    log("In main method");
  }

  public static void log(String s) {
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

    System.out.println(stackTraceElements[2].getClassName() + ": " + stackTraceElements[2].getMethodName() + ": "+ s);
  }
}
