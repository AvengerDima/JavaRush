package Level_3;

/*
План по захвату мира
*/

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class lvl_3_task_18 {
  public static void main(String[] args) throws Exception {

    InputStream inputStream = System.in;
    Reader inputStreamReader = new InputStreamReader(inputStream);
    BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

    String sAge = bufferedReader.readLine(); //читаем строку с клавиатуры
    String name = bufferedReader.readLine(); //читаем строку с клавиатуры
    //int nAge = Integer.parseInt(sAge); //преобразовываем строку в число.


    System.out.println(name +  " захватит мир через " + sAge + " лет. Му-ха-ха!");
    bufferedReader.close();
  }
}
