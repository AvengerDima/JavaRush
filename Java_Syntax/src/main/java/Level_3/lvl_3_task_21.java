package Level_3;

/*
Большая и чистая
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class lvl_3_task_21 {
  public static void main(String[] args) throws Exception {

    BufferedReader names = new BufferedReader(new InputStreamReader(System.in));

    //System.out.println("Введите первое имя: ");
    String name1 = names.readLine();

    //System.out.println("Введите второе имя: ");
    String name2 = names.readLine();

    //System.out.println("Введите третье имя: ");
    String name3 = names.readLine();

    System.out.println(name1 + " + " + name2 + " + " + name3 + " = Чистая любовь, да-да!");
  }
}
