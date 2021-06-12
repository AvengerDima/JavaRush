package Level_6;

/*
Класс StringHelper
*/

public class lvl_6_task_11 {
  public static String multiply(String s) {
    String result = "";

    result = s + s + s + s + s;
    return result;
  }

  public static String multiply(String s, int count) {
    String result = "";

    for(int i = 0; i < count; i++){
      result += s;
    }
    return result;
  }

  public static void main(String[] args) {
    System.out.println(lvl_6_task_11.multiply("Amigo"));
    System.out.println(lvl_6_task_11.multiply("Dmitry", 3));
  }
}
