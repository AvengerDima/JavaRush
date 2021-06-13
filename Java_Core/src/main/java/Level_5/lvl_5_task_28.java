package Level_5;

/*
ООП. Hrivna — тоже деньги
*/

public class lvl_5_task_28 {
  public static void main(String[] args) {
    System.out.println(new Hrivna().getAmount());
  }

  public static abstract class Money {
    abstract Money getMoney();

    public Object getAmount() {
      return getMoney().getAmount();
    }
  }

  //add your code below - добавь код ниже
  public static class Hrivna extends Money {
    private double amount = 123d;

    public Hrivna getMoney() {
      return this;
    }

    @Override
    public Object getAmount() {
      return amount;
    }
  }
}
