package Level_7;

/*
Семейная перепись
*/

public class lvl_7_task_24 {
  public static void main(String[] args) {
    Human Grandfather1 = new Human("Николай", true, 70);
    Human Grandfather2 = new Human("Георгий", true, 69);
    Human Grandmother1 = new Human("Мария", false, 70);
    Human Grandmother2 = new Human("Анастасия", false, 67);
    Human Father = new Human("Иван", true, 40, Grandfather1, Grandmother1);
    Human Mother = new Human("Анна", false, 37, Grandfather2, Grandmother2);
    Human Child1 = new Human("Артур", true, 18, Father, Mother);
    Human Child2 = new Human("Ян", true, 16, Father, Mother);
    Human Child3 = new Human("Евгения", false, 17, Father, Mother);

    System.out.println(Grandfather1);
    System.out.println(Grandfather2);
    System.out.println(Grandmother1);
    System.out.println(Grandmother2);
    System.out.println(Father);
    System.out.println(Mother);
    System.out.println(Child1);
    System.out.println(Child2);
    System.out.println(Child3);
  }

  public static class Human {
    String name;
    boolean sex;
    int age;
    Human father;
    Human mother;

    public Human (String name, boolean sex, int age) {
      this.name = name;
      this.sex = sex;
      this.age = age;
    }

    public Human (String name, boolean sex, int age, Human father, Human mother) {
      this(name, sex, age);
      this.father = father;
      this.mother = mother;
    }

    public String toString() {
      String text = "";
      text += "Имя: " + this.name;
      text += ", пол: " + (this.sex ? "мужской" : "женский");
      text += ", возраст: " + this.age;

      if (this.father != null)
        text += ", отец: " + this.father.name;

      if (this.mother != null)
        text += ", мать: " + this.mother.name;

      return text;
    }
  }
}
