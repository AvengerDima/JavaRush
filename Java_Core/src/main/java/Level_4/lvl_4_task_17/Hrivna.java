package Level_4.lvl_4_task_17;

public class Hrivna extends Money {
  @Override
  public double getAmount() {
    return 0;
  }

  @Override
  public String getCurrencyName() {
    return "UAH";
  }

  public Hrivna(double amount) {
    super(amount);
  }
}
