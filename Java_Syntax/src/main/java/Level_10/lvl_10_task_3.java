package Level_10;

/*
Задача №3 на преобразование целых типов
*/

public class lvl_10_task_3 {
  public static void main(String[] args) {
    float f = (float) 128.50;
    int i = (int) f;
    int b = (int) (i + f);
    b = (byte) b;
    System.out.println(b);
  }
}
