package Level_4.lvl_4_task_17;

public abstract class Money {
  private double amount;

  public Money(double amount) {
    this.amount = amount;
  }

  public double getAmount() {
    return amount;
  }

  public abstract String getCurrencyName();
}
