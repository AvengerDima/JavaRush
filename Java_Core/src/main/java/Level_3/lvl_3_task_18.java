package Level_3;

/*
Чтение файла
*/

import java.io.*;

public class lvl_3_task_18 {
  public static void main(String[] args) throws IOException {
    // напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    InputStream inStream = new FileInputStream(reader.readLine());

    while (inStream.available() > 0){
      System.out.print((char) inStream.read());
    }
    System.out.println();
    inStream.close();
    reader.close();
  }
}
