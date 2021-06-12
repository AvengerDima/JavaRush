package Level_5;

/*
Программист создает человека
*/

public class lvl_5_task_14 {
  public static void main(String[] args) {

    Person person = new Person();
    person.initialize("Vaska", 5);
  }

  static class Person {

    public String name;
    public int age;

    public void initialize(String name, int age){
      this.name = name;
      this.age = age;
    }
  }
}
