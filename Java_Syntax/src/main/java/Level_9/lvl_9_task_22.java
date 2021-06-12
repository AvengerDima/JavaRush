package Level_9;

/*
Какое сегодня число?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class lvl_9_task_22 {
  public static void main(String[] args) throws Exception {
    //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String sDate = reader.readLine();
    SimpleDateFormat dateFormat = new SimpleDateFormat();
    try{
      dateFormat.applyPattern("yyyy-MM-dd");
      Date date = dateFormat.parse(sDate);
      dateFormat = new SimpleDateFormat("MMM dd, yyyy", Locale.ENGLISH);
      System.out.println(dateFormat.format(date).toUpperCase());
    } catch (Exception e){ System.out.println("Неверный ввод"); }
  }
}
