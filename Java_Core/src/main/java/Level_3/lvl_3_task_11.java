package Level_3;

/*
Нанимаем переводчика
*/

public class lvl_3_task_11 {
  public static void main(String[] args) throws Exception {
    EnglishTranslator englishTranslator = new EnglishTranslator();
    System.out.println(englishTranslator.translate());
  }

  public static abstract class Translator {
    public abstract String getLanguage();

    public String translate() {
      return "Я переводчик с " + getLanguage();
    }
  }

  public static class EnglishTranslator extends Translator {
    @Override
    public String getLanguage() {
      return "английского";
    }
  }
}
