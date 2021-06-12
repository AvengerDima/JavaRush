package Level_9;

/*
Обогатим код функциональностью!
*/

import java.io.*;

public class lvl_9_task_29 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    InputStream fileInputStream = null;
    int count = 0;

    for (int i = 0; i< 2; i++) {
      if (count==3){
        Thread.currentThread().stop();
      }
      try {
        fileInputStream = getInputStream(reader.readLine());
        break;

      } catch (FileNotFoundException e) {
        System.out.println("Файл не существует.");
        count++;
        continue;

      }
    }

    String destinationFileName = reader.readLine();
    OutputStream fileOutputStream = getOutputStream(destinationFileName);

    while (fileInputStream.available() > 0) {
      int data = fileInputStream.read();
      fileOutputStream.write(data);
    }

    fileInputStream.close();
    fileOutputStream.close();
  }

  public static InputStream getInputStream(String fileName) throws IOException {
    return new FileInputStream(fileName);
  }

  public static OutputStream getOutputStream(String fileName) throws IOException {
    return new FileOutputStream(fileName);
  }
}
