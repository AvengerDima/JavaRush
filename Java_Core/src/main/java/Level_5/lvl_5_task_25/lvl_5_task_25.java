package Level_5.lvl_5_task_25;

/*
Файл в статическом блоке
*/

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class lvl_5_task_25 {
  public static List<String> lines = new ArrayList<String>();

  static {
    InputStream inputStream = null;
    try {
      inputStream = new FileInputStream(Statics.FILE_NAME);
      InputStreamReader inputStreamReader = new InputStreamReader(inputStream, "WINDOWS-1251");
      BufferedReader reader = new BufferedReader(inputStreamReader);
      while (true) {
        String s = reader.readLine();
        if (s == null)
          break;
        lines.add(s);
      }
      reader.close();

    } catch (FileNotFoundException e) {
      e.printStackTrace();
    } catch (UnsupportedEncodingException e) {
      e.printStackTrace();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }


  public static void main(String[] args) {
    System.out.println(lines);
  }
}
