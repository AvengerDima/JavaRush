package Level_9;

/*
Исключение при работе с числами
*/

public class lvl_9_task_12 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    try {
      int num = Integer.parseInt("XYZ");
      System.out.println(num);
    }
    catch (NumberFormatException e) {
      System.out.println(e);
    }
    //напишите тут ваш код
  }
}
