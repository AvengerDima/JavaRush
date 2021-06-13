package Level_5;

/*
Парсер реквестов
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class lvl_5_task_27 {
  public static void main(String[] args) throws IOException {
    //add your code here
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String n = reader.readLine();
    int indexM = n.indexOf("?");
    String n2 = n.substring(indexM+1);
    ArrayList<String> Obj = new ArrayList();

    for (String retval : n2.split("&")) {
      int index = retval.indexOf("=");
      if (index != -1)
      {
        String par = retval.substring(0, index);
        System.out.print(par);
        if (par.equals("obj"))
          Obj.add(retval.substring(index + 1));

      }
      else
        System.out.print(retval);
      System.out.print(" ");
    }

    for (int i = 0; i < Obj.size() ; i++)
    {
      try {
        double d3 = Double.parseDouble( Obj.get(i));
        alert(d3);

      } catch (NumberFormatException e) {
        alert(Obj.get(i));
      }
    }
  }

  public static void alert(double value) {
    System.out.println("double: " + value);
  }

  public static void alert(String value) {
    System.out.println("String: " + value);
  }
}
