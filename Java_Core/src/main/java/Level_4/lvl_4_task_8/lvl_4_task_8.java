package Level_4.lvl_4_task_8;

/*
Куриная фабрика
*/

public class lvl_4_task_8 {
  public static void main(String[] args) {
    Hen hen = HenFactory.getHen(Country.BELARUS);
    hen.getCountOfEggsPerMonth();
  }

  static class HenFactory {

    static Hen getHen(String country) {
      Hen hen = null;
      //напишите тут ваш код
      if (country.equals("Russia")) {
        hen = new RussianHen();
      }
      if (country.equals("Ukraine")) {
        hen = new UkrainianHen();
      }
      if (country.equals("Moldova")) {
        hen = new MoldovanHen();
      }
      if (country.equals("Belarus")) {
        hen = new BelarusianHen();
      }
      return hen;
    }
  }
}
