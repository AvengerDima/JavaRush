package Level_9;

/*
Страшная сказка
*/

import java.util.ArrayList;

public class lvl_9_task_24 {
  public static LittleRedRidingHood hood = new LittleRedRidingHood();
  public static Grandmother grandmother = new Grandmother();
  public static Patty patty = new Patty();
  public static Woodman woodman = new Woodman();
  public static Wolf wolf = new Wolf();

  public static void main(String[] args) {
    // напишите тут ваш код
    wolf.ate.add(grandmother);
    wolf.ate.add(hood);
    woodman.killed.add(wolf);
  }

  // Красная шапочка
  public static class LittleRedRidingHood extends StoryItem {
  }

  // Бабушка
  public static class Grandmother extends StoryItem {
  }

  // Пирожок
  public static class Patty extends StoryItem {
  }

  // Дровосек
  public static class Woodman extends StoryItem {
  }

  // Волк
  public static class Wolf extends StoryItem {
  }

  public static abstract class StoryItem {
    public ArrayList<StoryItem> killed = new ArrayList<>();
    public ArrayList<StoryItem> ate = new ArrayList<>();
  }
}
