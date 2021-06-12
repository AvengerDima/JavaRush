package Level_3;

/*
Конвертируем время
*/

public class lvl_3_task_11 {
  public static int convertToSeconds(int hour){

    return hour* 60 * 60;
  }

  public static void main(String[] args) {

    System.out.println(convertToSeconds(1));
    System.out.println(convertToSeconds(3));
  }
}
