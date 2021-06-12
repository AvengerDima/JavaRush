package Level_6;

/*
Класс ConsoleReader
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_6_task_10 {
  public static String readString() throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String text = reader.readLine();
    return text;
  }

  public static int readInt() throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    int a = Integer.parseInt(reader.readLine());
    return a;
  }

  public static double readDouble() throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    double b = Double.parseDouble(reader.readLine());
    return b;
  }

  public static boolean readBoolean() throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    boolean c = Boolean.parseBoolean(reader.readLine());
    return c;
  }

  public static void main(String[] args) {

  }
}
