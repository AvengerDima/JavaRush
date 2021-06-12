package Level_4;

/*
Bingo-2!
*/

public class lvl_4_task_2 {
    public static void main(String[] args) {
      Cat cat = new TomCat();

      boolean isCat = cat instanceof Cat;
      boolean isMovable = cat instanceof CanMove;
      boolean isTom = cat instanceof TomCat;

      if (isCat && isMovable && isTom) System.out.println("Bingo!");
    }

    interface CanMove {
    }

    static class Cat implements CanMove {
    }

    static class TomCat extends Cat {

    }
}
