package Level_8;

/*
Работа с датой
*/

import java.util.Date;

public class lvl_8_task_27 {
  public static void main(String[] args) {
    System.out.println(isDateOdd("MAY 1 2013"));
  }

  public static boolean isDateOdd(String date) {
    Date yearTime = new Date(date);
    yearTime.setHours(0);
    yearTime.setMinutes(0);
    yearTime.setSeconds(0);

    yearTime.setDate(0);
    yearTime.setMonth(0);

    Date currentTime = new Date(date);

    long msTime = currentTime.getTime() - yearTime.getTime();
    long msDay = 24 * 60 * 60 * 1000;
    int day = (int) (msTime / msDay);

    if(day % 2 == 0)
    {
      return false;
    }else{
      return true;
    }
  }
}
