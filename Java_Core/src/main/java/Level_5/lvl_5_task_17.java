package Level_5;

/*
Статики и исключения
*/

public class lvl_5_task_17 {
  public static int A = 0;

  static {
    //throw an exception here - выбросьте эксепшн тут
    A = 3 / A;
  }

  public static int B = 5;

  public static void main(String[] args) {
    System.out.println(B);
  }
}
