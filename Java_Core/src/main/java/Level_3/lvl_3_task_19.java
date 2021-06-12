package Level_3;

/*
Писатель в файл с консоли
*/

import java.io.*;

public class lvl_3_task_19 {
  public static void main(String[] args) throws IOException {
    // напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    BufferedWriter writer = new BufferedWriter(new FileWriter(reader.readLine()));
    String str;
    do  {
      str = reader.readLine();
      writer.write(str);
      writer.newLine();
    } while (!str.equals("exit"));
    writer.close();
    reader.close();
  }
}
