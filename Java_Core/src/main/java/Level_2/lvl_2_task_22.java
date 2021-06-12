package Level_2;

/*
Больше не Пушистик
*/

public class lvl_2_task_22 {
  public static void main(String[] args) {
    Pet pet = new Cat();
    pet.setName("Я - пушистик");

    System.out.println(pet.getName());
  }

  public static class Pet {
    protected String name;

    public Pet() {
    }

    public String getName() {
      return name;
    }

    public void setName(String name) {
      this.name = name;
    }

  }

  public static class Cat extends Pet {
    @Override
    public String getName() {
      return "Я - кот";
    }

    @Override
    public void setName(String name) {
      super.setName(name);
    }
  }
}
