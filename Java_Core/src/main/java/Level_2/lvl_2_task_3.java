package Level_2;

/*
Кесарю — кесарево
*/

public class lvl_2_task_3 {
  public static void main(String[] args) {
    Pet pet1 = new Cat();
    Pet cat = pet1.getChild();

    Pet pet2 = new Dog();
    Pet dog = pet2.getChild();
  }

  public static class Pet {
    public Pet getChild() {
      return new Pet();
    }
  }

  public static class Cat extends Pet {
    public Cat getChild() {
      return new Cat();
    }
  }

  public static class Dog extends Pet {
    public Dog getChild() {
      return new Dog();
    }
  }
}
