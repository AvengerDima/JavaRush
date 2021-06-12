package Level_6;

/*
Статические методы для кошек
*/

public class lvl_6_task_8 {
  private static int catCount = 0;

  public lvl_6_task_8() {

    catCount++;
  }

  public static int getCatCount() {

    return catCount;
  }

  public static void setCatCount(int catCount) {

    lvl_6_task_8.catCount = catCount;
  }

  public static void main(String[] args) {

  }
}
