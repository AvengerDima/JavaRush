package Level_5.lvl_5_task_30;

public abstract class DrinkMaker {
  abstract void getRightCup();
  abstract void putIngredient();
  abstract void pour();

  void makeDrink() {
    getRightCup();
    putIngredient();
    pour();
  }
}
