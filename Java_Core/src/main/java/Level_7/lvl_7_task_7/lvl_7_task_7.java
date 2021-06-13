package Level_7.lvl_7_task_7;

/*
МВФ
*/

public class lvl_7_task_7 {
  public static void main(String[] args) {
    IMF fund = IMF.getFund();
    IMF anotherFund = IMF.getFund();
    System.out.println(fund == anotherFund );
  }
}
