package Level_4.lvl_4_task_8;

public class RussianHen extends Hen {
  @Override
  int getCountOfEggsPerMonth() {
    return 10;
  }

  @Override
  public String getDescription() {
    String s = super.getDescription() + " Моя страна - " + Country.RUSSIA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    return s;
  }
}
