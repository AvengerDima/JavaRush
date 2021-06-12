package Level_4.lvl_4_task_17;

public class Ruble extends Money {
  @Override
  public double getAmount() {
    return 0;
  }

  @Override
  public String getCurrencyName() {
    return "RUB";
  }

  public Ruble(double amount) {
    super(amount);
  }
}
