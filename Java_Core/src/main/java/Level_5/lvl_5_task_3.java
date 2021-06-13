package Level_5;

/*
ООП - машинки
*/

import static Java_Core.Level_5.lvl_5_task_3.Constants.*;

public class lvl_5_task_3 {
  public static void main(String[] args) {
    new LuxuriousCar().printlnDesire();
    new CheapCar().printlnDesire();
    new Ferrari().printlnDesire();
    new Lanos().printlnDesire();
  }

  public static class LuxuriousCar {
    protected void printlnDesire() {
      System.out.println(WANT_STRING + LUXURIOUS_CAR);
    }
  }

  public static class CheapCar {
    protected void printlnDesire() {
      System.out.println(WANT_STRING + CHEAP_CAR);
    }
  }

  public static class Ferrari extends LuxuriousCar{
    public void printlnDesire() {
      //add your code here
      System.out.println(WANT_STRING + FERRARI_NAME);
    }
  }

  public static class Lanos extends CheapCar{
    public void printlnDesire() {
      //add your code here
      System.out.println(WANT_STRING + LANOS_NAME);
    }
  }

  public static class Constants {
    public static String WANT_STRING = "Я хочу ездить на ";
    public static String LUXURIOUS_CAR = "роскошной машине";
    public static String CHEAP_CAR = "дешевой машине";
    public static String FERRARI_NAME = "Феррари";
    public static String LANOS_NAME = "Ланосе";
  }
}
