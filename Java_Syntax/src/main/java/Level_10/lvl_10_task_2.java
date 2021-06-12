package Level_10;

/*
Задача №2 на преобразование целых типов
*/

public class lvl_10_task_2 {
  public static void main(String[] args) {
    int a = 15;
    int b = 4;
    float c = (float) a / b;
    double d = (double) a * 1e-3 + c;

    System.out.println(d);
  }
}
