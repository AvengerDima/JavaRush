package Level_0;

/*
Комментарии излишни
*/

public class lvl_0_task_7 {
  public static void main(String[] args) {

    int x = 2;
    int y = 12;

    // y = x * y;
    //y = x + y;

    x = y - x;
    y = y - x;

    System.out.println(x);
    System.out.println(y);
  }
}
