package Level_10;

/*
Конструкторы класса Human
*/

public class lvl_10_task_13 {
  public static void main(String[] args) {
  }

  public static class Human {
    // Напишите тут ваши переменные и конструкторы
    private String name;
    private String surname;
    private int age;
    private int height;
    private int weight;
    private String city;

    public Human(String name){
      this.name = name;
    }

    public Human(String name, String surname){
      this.name = name;
      this.surname = surname;
    }

    public Human(String name, String surname, int age){
      this.name = name;
      this.surname = surname;
      this.age = age;
    }

    public Human(String name, String surname, int age, int height){
      this.name = name;
      this.surname = surname;
      this.age = age;
      this.height = height;
    }

    public Human(String name, String surname, int age, int height, int weight){
      this.name = name;
      this.surname = surname;
      this.age = age;
      this.height = height;
      this.weight = weight;
    }

    public Human(String name, String surname, int age, int height, int weight, String city){
      this.name = name;
      this.surname = surname;
      this.age = age;
      this.height = height;
      this.weight = weight;
      this.city = city;
    }

    public Human(String name, int age){
      this.name = name;
      this.age = age;
    }

    public Human(String name, int age, String city){
      this.name = name;
      this.age = age;
      this.city = city;
    }

    public Human(String name, int height, int weight){
      this.name = name;
      this.height = height;
      this.weight = weight;
    }

    public Human(String name, int age, int height, int weight){
      this.name = name;
      this.age = age;
      this.height = height;
      this.weight = weight;
    }
  }
}
