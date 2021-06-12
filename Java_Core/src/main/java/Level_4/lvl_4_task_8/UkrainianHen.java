package Level_4.lvl_4_task_8;

public class UkrainianHen extends Hen {
  @Override
  int getCountOfEggsPerMonth() {
    return 20;
  }

  @Override
  public String getDescription() {
    String s = super.getDescription() + " Моя страна - " + Country.UKRAINE + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    return s;
  }
}
