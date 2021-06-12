package Level_2;

/*
Киты и коровы
*/

public class lvl_2_task_1 {
  public static void main(String[] args) {
    Cow cow = new Whale();

    System.out.println(cow.getName());
  }

  public static class Cow {
    public String getName() {
      return "Я - корова";
    }
  }

  public static class Whale extends Cow {
    public String getName() {
      return "Я не корова, Я - кит.";
    }
  }
}
