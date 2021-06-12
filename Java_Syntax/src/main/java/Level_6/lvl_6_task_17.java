package Level_6;

/*
Блокнот для новых идей
*/

public class lvl_6_task_17 {
  public static void main(String[] args) {
    printIdea(new Idea());
  }

  public static class Idea{
    public String Description;

    public String getDescription(){
      String text = "Idea";
      return text;
    }
  }

  public static void printIdea(Idea idea){
    System.out.println(idea.getDescription());
  }
}
