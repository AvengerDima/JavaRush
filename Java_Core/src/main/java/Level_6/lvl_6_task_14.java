package Level_6;

/*
Обратный отсчет
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_6_task_14 {
  public static volatile List<String> list = new ArrayList<String>(5);

  static {
    for (int i = 0; i < 5; i++) {
      list.add("Строка " + i);
    }
  }

  public static void main(String[] args) throws InterruptedException {
    Thread t = new Thread(new Countdown(3), "Countdown");
    t.start();
  }

  public static class Countdown implements Runnable {
    private int countFrom;

    public Countdown(int countFrom) {
      this.countFrom = countFrom;
    }

    public void run() {
      try {
        while (countFrom > 0) {
          printCountdown();
        }
      } catch (InterruptedException e) {
      }
    }

    public void printCountdown() throws InterruptedException {
      //add your code here - добавь код тут
      Thread.sleep(500);
      countFrom--;
      System.out.println(list.get(countFrom));
    }
  }
}
