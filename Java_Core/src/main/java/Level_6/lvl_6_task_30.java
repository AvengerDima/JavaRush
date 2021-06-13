package Level_6;

/*
Последовательный вывод файлов
*/

import java.io.*;
import java.util.ArrayList;

public class lvl_6_task_30 {
  public static String firstFileName;
  public static String secondFileName;

  //add your code here - добавьте код тут
  public static volatile BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

  static {
    try {
      firstFileName = reader.readLine();
      secondFileName = reader.readLine();
      reader.close();
    } catch (IOException e) {

    }
  }

  public static void main(String[] args) throws InterruptedException {
    systemOutPrintln(firstFileName);
    systemOutPrintln(secondFileName);
  }

  public static void systemOutPrintln(String fileName) throws InterruptedException {
    ReadFileInterface f = new ReadFileThread();
    f.setFileName(fileName);
    f.start();
    //add your code here - добавьте код тут
    f.join();
    System.out.println(f.getFileContent());
  }

  public interface ReadFileInterface {

    void setFileName(String fullFileName);

    String getFileContent();

    void join() throws InterruptedException;

    void start();
  }

  //add your code here - добавьте код тут
  public static class ReadFileThread extends Thread implements ReadFileInterface {
    String fileName;
    String string = "";

    ArrayList<String> arrayList = new ArrayList<String>();

    @Override
    public void setFileName(String fullFileName) {
      fileName = fullFileName;
    }

    @Override
    public String getFileContent() {
      for (int i = 0; i < arrayList.size(); i++) {
        string += arrayList.get(i) + " ";
      }
      return string;
    }

    @Override
    public void run() {
      try {
        FileInputStream fileInputStream = new FileInputStream(fileName);
        InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
        BufferedReader reader = new BufferedReader(inputStreamReader);

        String str = reader.readLine();

        while (str != null) {
          arrayList.add(str);
          str = reader.readLine();
        }
        fileInputStream.close();
        inputStreamReader.close();
        reader.close();
      } catch (FileNotFoundException e) {

      } catch (IOException e) {

      }
    }
  }
}
