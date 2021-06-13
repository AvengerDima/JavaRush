package Level_5;

/*
ООП - Наследование животных
*/

public class lvl_5_task_2 {
  //добавьте классы Goose и Dragon тут
  public static class Goose extends SmallAnimal {
    @Override
    public String getSize() {
      return "Гусь маленький, " + super.getSize();
    }
  }

  public static class Dragon extends BigAnimal {
    @Override
    public String getSize() {
      return "Дракон большой, " + super.getSize();
    }
  }

  public static void main(String[] args) {

  }

  public static class BigAnimal {
    protected String getSize() {
      return "как динозавр";
    }
  }

  public static class SmallAnimal {
    String getSize() {
      return "как кошка";
    }
  }
}
