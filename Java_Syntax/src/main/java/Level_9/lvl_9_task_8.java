package Level_9;

/*
Исключение при работе со строками
*/

public class lvl_9_task_8 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    try {
      String s = null;
      String m = s.toLowerCase();
    }
    catch (NullPointerException e) {
      System.out.println(e);
    }
    //напишите тут ваш код
  }
}
