package Level_4.lvl_4_task_10;

/*
Дегустация вин
*/

public class lvl_4_task_10 {
  public static void main(String[] args) {
    getDeliciousDrink().taste();
    System.out.println(getWine().getHolidayName());
    System.out.println(getBubblyWine().getHolidayName());
    System.out.println(getWine().getHolidayName());
  }

  public static Drink getDeliciousDrink() {
    Wine wine = new Wine();
    return wine;
  }

  public static Wine getWine() {
    Wine wine1 = new Wine();
    return wine1;
  }

  public static Wine getBubblyWine() {
    BubblyWine bubblyWine = new BubblyWine();
    return bubblyWine;
  }
}
