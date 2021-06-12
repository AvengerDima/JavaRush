package Level_3;

/*
Баг в initializeIdAndName
*/

public class lvl_3_task_6 {
  public static void main(String[] args) throws Exception {
    System.out.println(Matrix.NEO);
    System.out.println(Matrix.TRINITY);
  }

  public static class Matrix {
    public static DBObject NEO = new User().initializeIdAndName(1, "Neo");
    public static DBObject TRINITY = new User().initializeIdAndName(2, "Trinity");
  }

  public interface DBObject {
    DBObject initializeIdAndName(long id, String name);
  }

  public static class User implements DBObject {
    long id;
    String name;

    @Override
    public User initializeIdAndName(long id, String name) {
      this.id = id;
      this.name = name;
      return this;
    }

    @Override
    public String toString() {
      return String.format("The user's name is %s, id = %d", name, id);
    }
  }
}
