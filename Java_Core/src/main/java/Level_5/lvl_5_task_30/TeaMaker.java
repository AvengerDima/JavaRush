package Level_5.lvl_5_task_30;

public class TeaMaker extends DrinkMaker {
  @Override
  void getRightCup() {
    System.out.println("Берем чашку для чая");
  }

  @Override
  void putIngredient() {
    System.out.println("Насыпаем чай");
  }

  @Override
  void pour() {
    System.out.println("Заливаем кипятком");
  }
}
