package Level_10;

/*
Задача №1 на преобразование целых типов
*/

public class lvl_10_task_1 {
  public static void main(String[] args) {
    int a = 0;
    int b = (byte) a + 46;
    byte c = (byte) (a * b);
    double f = (short) 1234.15;
    long d = (char) (a + f / c + b);
    System.out.println(d);
  }
}
