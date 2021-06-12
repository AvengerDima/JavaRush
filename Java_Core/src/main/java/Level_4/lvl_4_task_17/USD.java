package Level_4.lvl_4_task_17;

public class USD extends Money {
  @Override
  public double getAmount() {
    return 0;
  }

  @Override
  public String getCurrencyName() {
    return "USD";
  }

  public USD(double amount) {
    super(amount);
  }
}
