package Level_8;

/*
Собираем семейство
*/

import java.util.ArrayList;

public class lvl_8_task_24 {
  public static void main(String[] args) {
    //напишите тут ваш код
    Human child1 = new Human("Ребёнок1", true, 23, new ArrayList<Human>());
    Human child2 = new Human("Ребёнок2", false, 18, new ArrayList<Human>());
    Human child3 = new Human("Ребёнок3", true, 13, new ArrayList<Human>());
    ArrayList<Human> children = new ArrayList<Human>();
    children.add(child1);
    children.add(child2);
    children.add(child3);

    Human father = new Human("Отец", true, 46, children);
    Human mother = new Human("Мать", false, 45, children);
    ArrayList<Human> parents1 = new ArrayList<Human>();
    ArrayList<Human> parents2 = new ArrayList<Human>();
    parents1.add(father);
    parents2.add(mother);

    Human grandfather1 = new Human("Дедушка1", true, 75, parents1);
    Human grandmother1 = new Human("Бабушка1", false, 75, parents1);
    Human grandfather2 = new Human("Дедушка2", true, 81, parents2);
    Human grandmother2 = new Human("Бабушка2", false, 80, parents2);

    System.out.println(grandfather1.toString());
    System.out.println(grandmother1.toString());
    System.out.println(grandfather2.toString());
    System.out.println(grandmother2.toString());
    System.out.println(father.toString());
    System.out.println(mother.toString());
    System.out.println(child1.toString());
    System.out.println(child2.toString());
    System.out.println(child3.toString());
  }

  public static class Human {
    //напишите тут ваш код
    String name;
    boolean sex;
    int age;
    ArrayList<Human> children;

    public Human(String name, boolean sex, int age, ArrayList<Human> children){
      this.name = name;
      this.sex = sex;
      this.age = age;
      this.children = children;
    }

    public String toString() {
      String text = "";
      text += "Имя: " + this.name;
      text += ", пол: " + (this.sex ? "мужской" : "женский");
      text += ", возраст: " + this.age;

      int childCount = this.children.size();
      if (childCount > 0) {
        text += ", дети: " + this.children.get(0).name;

        for (int i = 1; i < childCount; i++) {
          Human child = this.children.get(i);
          text += ", " + child.name;
        }
      }
      return text;
    }
  }
}
