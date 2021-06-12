package Level_8;

/*
Добрая Зинаида и летние каникулы
*/

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class lvl_8_task_16 {
  public static HashMap<String, Date> createMap() throws ParseException {
    DateFormat df = new SimpleDateFormat("MMMMM d yyyy", Locale.ENGLISH);
    HashMap<String, Date> map = new HashMap<String, Date>();
    map.put("Stallone", df.parse("JUNE 1 1980"));

    //напишите тут ваш код
    map.put("Kolegov", df.parse("MARCH 11 1998"));
    map.put("Varich", df.parse("NOVEMBER 14 1999"));
    map.put("Turchin", df.parse("DECEMBER 19 1991"));
    map.put("Velko", df.parse("APRIL 6 1997"));
    map.put("Misurskiy", df.parse("FEBRUARY 9 1996"));
    map.put("Kovalev", df.parse("JANUARY 26 1993"));
    map.put("Kotik", df.parse("MAY 23 1996"));
    map.put("Anisimov", df.parse("JUNE 15 1995"));
    map.put("Aniskote", df.parse("JULY 7 1993"));

    return map;
  }

  public static void removeAllSummerPeople(HashMap<String, Date> map) {
    //напишите тут ваш код
    Iterator<HashMap.Entry<String, Date>> iterator = map.entrySet().iterator();
    while (iterator.hasNext()){
      Map.Entry<String, Date> pair = iterator.next();
      String key = pair.getKey();
      Date value = pair.getValue();
      if (value.getMonth() > 4 && value.getMonth() < 8){
        iterator.remove();
      }
    }
  }

  public static void main(String[] args) {

  }
}
