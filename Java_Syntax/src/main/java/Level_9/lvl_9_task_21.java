package Level_9;

/*
Метод в try..catch
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_9_task_21 {
  public static void main(String[] args) {
    readData();
  }

  public static void readData(){
    //напишите тут ваш код
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ArrayList<Integer> list = new ArrayList<Integer>();
    try {
      for (int i = 0; i < 10; i++){
        list.add(Integer.parseInt(reader.readLine()));
      }
    } catch (IOException e) {
      e.printStackTrace();
    } catch (NumberFormatException e) {
      for (int x : list) {
        System.out.println(x);
      }
    }
  }
}
