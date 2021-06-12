package Level_4;

/*
Гадание на долларовый счет
*/

public class lvl_4_task_33 {
  public static void main(String[] args) throws Exception {

    String text = "S";
    int x = 10;
    while (x > 0) {
      int y = 10;
      while (y > 0) {
        System.out.print(text);
        y--;
      }
      System.out.println();
      x--;
    }
  }
}
