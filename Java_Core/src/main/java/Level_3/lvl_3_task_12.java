package Level_3;

/*
Код сам не исправится
*/

public class lvl_3_task_12 {
  public static void main(String[] args) throws Exception {
    Translator translator = new Translator();
    System.out.println(translator.translate());
  }

  public static class Translator {
    public String translate() {
      return "Я переводчик с английского";
    }
  }
}
