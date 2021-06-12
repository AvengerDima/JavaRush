package Level_2;

/*
Интерфейсы к классу Human
*/

public class lvl_2_task_28 {
  public static void main(String[] args) {
    Human human = new Human();
    System.out.println(human);
  }

  public static interface Worker {
    public void workLazy();
  }

  public static interface Businessman {
    public void workHard();
  }

  public static interface Secretary {
    public void workLazy();
  }

  public static interface Miner {
    public void workVeryHard();
  }

  public static class Human implements Worker, Businessman, Secretary {

    public void workHard() {
    }

    public void workLazy() {
    }
  }
}
