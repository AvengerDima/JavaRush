package Level_9;

/*
Обратный отсчёт
*/

public class lvl_9_task_20 {
  public static void main(String[] args) {
    for (int i = 10; i >= 0; i--) {
      System.out.println(i);

      //напишите тут ваш код
      try {
        Thread.sleep(100);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }
  }
}
