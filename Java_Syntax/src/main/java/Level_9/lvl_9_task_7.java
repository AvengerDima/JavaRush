package Level_9;

/*
Исключение при работе с числами
*/

public class lvl_9_task_7 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    try {
      int a = 42 / 0;
    }
    catch (ArithmeticException e) {
      System.out.println(e);
    }
    //напишите тут ваш код
  }
}
