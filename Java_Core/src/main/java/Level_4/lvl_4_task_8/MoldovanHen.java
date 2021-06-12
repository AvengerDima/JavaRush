package Level_4.lvl_4_task_8;

public class MoldovanHen extends Hen {
  @Override
  int getCountOfEggsPerMonth() {
    return 30;
  }

  @Override
  public String getDescription() {
    String s = super.getDescription() + " Моя страна - " + Country.MOLDOVA + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.";
    return s;
  }
}
