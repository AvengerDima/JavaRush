package Level_4.lvl_4_task_8;

public class BelarusianHen extends Hen {
  @Override
  int getCountOfEggsPerMonth() {
    return 40;
  }

  @Override
  public String getDescription() {
    String s = super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    return s;
  }
}
