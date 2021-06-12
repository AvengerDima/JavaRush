package Level_4;

/*
Настя или Настя?
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_4_task_21 {
  public static void main(String[] args) throws Exception {

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String name1 = reader.readLine();
    int len1 = name1.length();
    String name2 = reader.readLine();
    int len2 = name2.length();

    if(name1.equals(name2)){
      System.out.println("Имена идентичны");
    } else if(len1 == len2){
      System.out.println("Длины имен равны");
    } else{

    }
  }
}
