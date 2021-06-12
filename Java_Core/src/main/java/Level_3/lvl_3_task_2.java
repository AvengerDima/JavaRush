package Level_3;

/*
Пиво-2. Возвращение
*/

public class lvl_3_task_2 {
  public static void main(String[] args) throws Exception {
    Drink beer = new AlcoholicBeer();
    System.out.println(beer.toString());
  }

  public interface Drink {
    boolean isAlcoholic();
  }

  public static class AlcoholicBeer implements Drink {
    @Override
    public String toString() {
      if (isAlcoholic()) {
        return "Напиток алкогольный";
      } else {
        return "Напиток безалкогольный";
      }
    }

    @Override
    public boolean isAlcoholic() {
      return true;
    }
  }
}
