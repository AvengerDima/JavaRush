package Level_3;

/*
Полнометражная картина
*/

public class lvl_3_task_22 {
  public static void main(String[] args) {

    System.out.println(getMetreFromCentimetre(243));
  }

  public static int getMetreFromCentimetre(int centimetre) {

    centimetre = centimetre / 100;
    return centimetre;
  }
}
