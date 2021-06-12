package Level_5;

/*
Конструируем котиков
*/

public class lvl_5_task_17 {
  public String name = null;
  public int weight;
  public int age;
  public String color;
  public String address = null;

  public lvl_5_task_17(String name){
    this.name = name;
    this.weight = 5;
    this.age = 3;
    this.color = "Black";
  }

  public lvl_5_task_17(String name, int weight, int age){
    this.name = name;
    this.weight = weight;
    this.age = age;
    this.color = "Brown";
  }

  public lvl_5_task_17(String name, int age){ //вес стандартный
    this.name = name;
    this.age = age;
  }

  public lvl_5_task_17(int weight, String color){ //имя, адрес и возраст - неизвестные. Кот - бездомный
    this.weight = weight;
    this.age = 5;
    this.color = color;
  }

  public lvl_5_task_17(int weight, String color, String address){ //чужой домашний кот
    this.weight = weight;
    this.age = 7;
    this.color = color;
    this.address = address;
  }


  public static void main(String[] args) {

  }
}
