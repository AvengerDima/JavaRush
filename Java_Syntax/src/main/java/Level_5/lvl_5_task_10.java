package Level_5;

/*
Кошкоинициация
*/

public class lvl_5_task_10 {
  private String name = null;
  private int weight;
  private int age;
  private String color;
  private String address = null;

  public void initialize(String name){
    this.name = name;
    this.weight = 4;
    this.age = 3;
    this.color = "Black";
  }

  public void initialize(String name, int weight, int age){
    this.name = name;
    this.weight = weight;
    this.age = age;
    this.color = "Brown";
  }

  public void initialize(String name, int age){ //вес стандартный
    this.name = name;
    this.age = age;
  }

  public void initialize(int weight, String color){ //имя, адрес и возраст неизвестны, это бездомный кот
    this.weight = weight;
    this.age = 4;
    this.color = color;

  }

  public void initialize(int weight, String color, String address){ //чужой домашний кот
    this.weight = weight;
    this.age = 3;
    this.color = color;
    this.address = address;
  }

  public static void main(String[] args) {

  }
}
