package Level_4;

/*
Food
*/

public class lvl_4_task_5 {
  public static void main(String[] args) {
    Food food = new Food();
    Selectable selectable = new Food();
    Food newFood = (Food) selectable;

    foodMethods(food);
    selectableMethods(selectable);
  }

  public static void foodMethods(Food food) {
    //тут добавьте вызов методов для переменной food
    food.onSelect();
    food.onEat();
  }

  public static void selectableMethods(Selectable selectable) {
    //тут добавьте вызов методов для переменной selectable
    selectable.onSelect();
  }

  interface Selectable {
    void onSelect();
  }

  static class Food implements Selectable {
    public void onEat() {
      System.out.println("The food was eaten");
    }

    @Override
    public void onSelect() {
      System.out.println("The food was selected");
    }
  }
}
