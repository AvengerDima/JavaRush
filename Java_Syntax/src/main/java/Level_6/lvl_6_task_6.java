package Level_6;

/*
Контролируем массу тела
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_6_task_6 {
  public static void main(String[] args) throws IOException {
    BufferedReader bis = new BufferedReader(new InputStreamReader(System.in));
    double weight = Double.parseDouble(bis.readLine()); //вводим вес
    double height = Double.parseDouble(bis.readLine()); //вводим рост

    Body.calculateMassIndex(weight, height);
  }

  public static class Body {
    public static void calculateMassIndex(double weight, double height) {
      double IndexMass = weight / (height * height);
      if(IndexMass < 18.5){
        System.out.println("Недовес: меньше чем 18.5");
      } else if(IndexMass > 18.5 && IndexMass < 24.9){
        System.out.println("Нормальный: между 18.5 и 24.9");
      } else if(IndexMass > 25 && IndexMass < 29.9){
        System.out.println("Избыточный вес: между 25 и 29.9");
      } else if(IndexMass > 30){
        System.out.println("Ожирение: 30 или больше");
      } else{

      }
    }
  }
}
