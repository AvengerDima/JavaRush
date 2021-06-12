package Level_4;

/*
Времена года на Терре
*/

public class lvl_4_task_11 {
  public static void main(String[] args) {
    checkSeason(12);
    checkSeason(4);
    checkSeason(7);
    checkSeason(10);
  }

  public static void checkSeason(int month) {

    if(month == 12 || month == 1 || month == 2){
      System.out.println("зима");
    } else if(month == 4 || month == 3 || month == 5){
      System.out.println("весна");
    } else if(month == 7 || month == 6 || month == 8){
      System.out.println("лето");
    } else if(month == 10 || month == 9 || month == 11){
      System.out.println("осень");
    } else{
      System.out.println("Ошибка");
    }
  }
}
