package Level_6;

/*
Создание по образцу
*/

public class lvl_6_task_26 {
  public static int number = 5;

  public static void main(String[] args) {
    new Thread(new CountdownRunnable(), "Уменьшаем").start();
    new Thread(new CountUpRunnable(), "Увеличиваем").start();
  }

  public static class CountUpRunnable implements Runnable {
    //Add your code here - добавь код тут
    private int countIndexUp = 0;

    @Override
    public void run() {
      try {
        while (true) {
          Thread.sleep(500);
          countIndexUp += 1;
          System.out.println(toString());
          if (countIndexUp == lvl_6_task_26.number) return;
        }
      } catch (InterruptedException e) {
      }
      try {
        Thread.sleep(2500);
      } catch (InterruptedException e) {
        e.printStackTrace();
      }
    }

    @Override
    public String toString() {
      return Thread.currentThread().getName() + ": " + countIndexUp;
    }
  }


  public static class CountdownRunnable implements Runnable {
    private int countIndexDown = 0;

    public void run() {
      try {
        while (true) {
          System.out.println(toString());
          countIndexDown -= 1;
          if (countIndexDown == lvl_6_task_26.number) return;
          Thread.sleep(500);
        }
      } catch (InterruptedException e) {
      }
    }

    public String toString() {
      return Thread.currentThread().getName() + ": " + countIndexDown;
    }
  }
}
