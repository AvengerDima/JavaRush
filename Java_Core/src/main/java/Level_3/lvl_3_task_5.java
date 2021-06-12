package Level_3;

/*
Четыре ошибки
*/

public class lvl_3_task_5 {
  public static void main(String[] args) {
    System.out.println(Dream.HOBBY.toString());
    System.out.println(new Hobby().toString());
  }

  public interface Desire {
  }

  public interface Dream {
    public Hobby HOBBY = new Hobby();
  }

  public static class Hobby implements Desire, Dream {
    static int INDEX = 1;

    @Override
    public String toString() {
      INDEX++;
      return "" + INDEX;
    }
  }
}
