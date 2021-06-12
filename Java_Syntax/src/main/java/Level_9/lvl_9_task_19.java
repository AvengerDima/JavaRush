package Level_9;

/*
Деление на ноль
*/

public class lvl_9_task_19 {
  public static void main(String[] args) {
    try {
      divideByZero();
    } catch (Exception e) {
      e.printStackTrace();
    }
  }

  public static void divideByZero() throws Exception{
    int result = 10 / 0;
    System.out.println(result);
  }

  public static void printStackTrace(){
    StackTraceElement[] stackTraceElements = Thread.currentThread().getStackTrace();

    for (StackTraceElement element : stackTraceElements){
      System.out.println(element);
    }
  }
}
