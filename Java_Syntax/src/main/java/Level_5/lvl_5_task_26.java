package Level_5;

/*
Мужчина и женщина
*/

public class lvl_5_task_26 {
  public static void main(String[] args) {
    Man man1 = new Man("God", 999, "Paradise");
    System.out.println(man1.name + " " + man1.age + " " + man1.address);
    Man man2 = new Man("Lucifer", 900, "Hell");
    System.out.println(man2.name + " " + man2.age + " " + man2.address);

    Woman woman1 = new Woman("Dark", 999, "Emptiness");
    System.out.println(woman1.name + " " + woman1.age + " " + woman1.address);
    Woman woman2 = new Woman("Lilith", 900, "Hell");
    System.out.println(woman2.name + " " + woman2.age + " " + woman2.address);
  }

  public String name;
  public int age;
  public String address;

  public lvl_5_task_26(String name){
    this.name = name;
  }

  public lvl_5_task_26(String name, int age){
    this.name = name;
    this.age = age;
  }

  public lvl_5_task_26(String name, int age, String address){
    this.name = name;
    this.age = age;
    this.address = address;
  }

  public static class Man extends lvl_5_task_26 {
    public Man(String name, int age, String address){
      super(name, age, address);
    }
  }

  public static class Woman extends lvl_5_task_26 {
    public Woman(String name, int age, String address){
      super(name, age, address);
    }
  }
}
