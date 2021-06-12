package Level_6;

/*
Родственные связи кошек
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class lvl_6_task_21 {
  public static void main(String[] args) throws IOException {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    String grandfatherName = reader.readLine();
    Cat catGrandfather = new Cat(grandfatherName, null, null); //кот-дедушка

    String grandmotherName = reader.readLine();
    Cat catGrandmother = new Cat(grandmotherName, null, null); //кот-бабушка

    String fatherName = reader.readLine();
    Cat catFather = new Cat(fatherName, null, catGrandfather); //кот-папа

    String motherName = reader.readLine();
    Cat catMother = new Cat(motherName, catGrandmother, null); //кошка-мама

    String sonName = reader.readLine();
    Cat catSon = new Cat(sonName, catMother, catFather); //кот-сын

    String daughterName = reader.readLine();
    Cat catDaughter = new Cat(daughterName, catMother, catFather); //кот-дочь

    System.out.println(catGrandfather); //кот-дедушка
    System.out.println(catGrandmother); //кот-бабушка
    System.out.println(catFather); //кот-папа
    System.out.println(catMother); //кот-мама
    System.out.println(catSon); //кот-сын
    System.out.println(catDaughter); //кот-дочь
  }

  public static class Cat {
    private String name;
    private Cat motherParent;
    private Cat fatherParent;

    Cat(String name) {
      this.name = name;
    }

    Cat(String name, Cat motherParent, Cat fatherParent) {
      this.name = name;
      this.motherParent = motherParent;
      this.fatherParent = fatherParent;
    }

    @Override
    public String toString() {
      if(motherParent == null && fatherParent == null){
        return "The cat's name is " + name + ", no mother, no father";
      }else if(motherParent == null){
        return "The cat's name is " + name + ", no mother, father is " + fatherParent.name;
      }else if(fatherParent == null){
        return "The cat's name is " + name + ", mother is " + motherParent.name + ", no father ";
      } else{
        return "The cat's name is " + name + ", mother is " + motherParent.name + ", father is " + fatherParent.name;
      }
    }
  }
}
