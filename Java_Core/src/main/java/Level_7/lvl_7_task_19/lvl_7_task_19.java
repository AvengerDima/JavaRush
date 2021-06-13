package Level_7.lvl_7_task_19;

/*
Транзакционность
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class lvl_7_task_19 {
  public static List<String> allLines = new ArrayList<String>();
  public static List<String> forRemoveLines = new ArrayList<String>();

  public static void main(String[] args) throws IOException {
    String fileName1, fileName2;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    fileName1 = reader.readLine();
    fileName2 = reader.readLine();
    reader.close();

    BufferedReader reader1 = new BufferedReader(new FileReader(fileName1));
    String line = null;
    while ((line = reader1.readLine()) != null) {
      allLines.add(line);
    }
    reader1.close();

    BufferedReader reader2 = new BufferedReader(new FileReader(fileName2));
    line = null;
    while ((line = reader2.readLine()) != null) {
      forRemoveLines.add(line);
    }
    reader2.close();

    new lvl_7_task_19().joinData();
  }

  public void joinData() throws CorruptedDataException {
    if (allLines.containsAll(forRemoveLines)) {
      allLines.removeAll(forRemoveLines);
    }
    else {
      allLines.clear();
      throw new CorruptedDataException();
    }
  }
}
