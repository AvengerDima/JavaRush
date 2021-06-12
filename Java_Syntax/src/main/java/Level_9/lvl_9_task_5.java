package Level_9;

/*
Там, в синих глубинах стек-трейса…
*/

public class lvl_9_task_5 {
  public static void main(String[] args) throws Exception {
    int deep = getStackTraceDeep();
  }

  public static int getStackTraceDeep() {
    //напишите тут ваш код
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();
    System.out.println(stackTraceElements.length);
    return stackTraceElements.length;
  }
}
