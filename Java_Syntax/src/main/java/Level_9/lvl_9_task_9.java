package Level_9;

/*
Исключение при работе с массивами
*/

public class lvl_9_task_9 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    try {
      int[] m = new int[2];
      m[8] = 5;
    }
    catch (ArrayIndexOutOfBoundsException e) {
      System.out.println(e);
    }
    //напишите тут ваш код
  }
}
