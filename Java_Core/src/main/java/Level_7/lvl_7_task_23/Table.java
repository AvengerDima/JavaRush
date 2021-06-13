package Level_7.lvl_7_task_23;

public class Table {
  private static byte tableNumber;
  private byte number = ++tableNumber;

  public Order getOrder () {
    return new Order(number);
  }
}
