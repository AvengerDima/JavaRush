package Level_4;

/*
Цена яблок
*/

public class lvl_4_task_2 {
  public static void main(String[] args) {

    Apple apple = new Apple();
    apple.addPrice(50);
    Apple apple2 = new Apple();
    apple2.addPrice(100);
    System.out.println("Стоимость яблок " + Apple.applesPrice);
  }

  public static class Apple {
    public static int applesPrice = 0;

    public static void addPrice(int applesPrice) {

      Apple.applesPrice = Apple.applesPrice + applesPrice;
    }
  }
}
