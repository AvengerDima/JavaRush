package Level_2;

/*
Минимум четырех чисел
*/

public class lvl_2_task_16 {
  public static int min(int a, int b, int c, int d) {
    //напишите тут ваш код
    int x = min(min(a,b),min(c,d));
    return x;
  }

  public static int min(int a, int b) {

    if (a < b)
      return a;
    else
      return b;
  }

  public static void main(String[] args) throws Exception {

    System.out.println(min(-20, -10));
    System.out.println(min(-40, -10, -30, 40));
    System.out.println(min(-20, -40, -30, 40));
    System.out.println(min(-20, -10, -40, 40));
    System.out.println(min(-20, -10, -30, -40));
  }
}
