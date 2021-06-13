package Level_5.lvl_5_task_22;

/*
Закрепляем паттерн Singleton
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_5_task_22 {
  public static void main(String[] args) {

  }

  public static Planet thePlanet;

  //add static block here - добавьте статический блок тут
  static {
    readKeyFromConsoleAndInitPlanet();
  }

  public static void readKeyFromConsoleAndInitPlanet() {
    // implement step #5 here - реализуйте задание №5 тут
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    try {
      String s = reader.readLine();

      if (s.equals(Planet.SUN)) {
        thePlanet = Sun.getInstance();
      } else if (s.equals(Planet.MOON)) {
        thePlanet = Moon.getInstance();
      } else if (s.equals(Planet.EARTH)) {
        thePlanet = Earth.getInstance();
      } else {
        thePlanet = null;
      }
    } catch (IOException e) {
      System.out.println(e);
    }
  }
}
