package Level_6;

/*
Только по-очереди!
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_6_task_29 {
  public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  public static void main(String[] args) throws InterruptedException {
    Read3Strings t1 = new Read3Strings();
    Read3Strings t2 = new Read3Strings();

    //add your code here - добавьте код тут
    t1.start();
    t1.join();
    t2.start();
    t2.join();
    t1.printResult();
    t2.printResult();
  }

  //add your code here - добавьте код тут
  public static class Read3Strings extends Thread {
    String a, b, c;

    @Override
    public void run() {
      try {
        a = reader.readLine();
        b = reader.readLine();
        c = reader.readLine();
      } catch (IOException e) {
        e.printStackTrace();
      }
    }

    public void printResult() {
      System.out.println(a + " " + b + " " + c);
    }
  }
}
