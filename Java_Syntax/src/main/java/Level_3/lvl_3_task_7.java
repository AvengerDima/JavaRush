package Level_3;

/*
Привет StarCraft!
*/

public class lvl_3_task_7 {
  public static void main(String[] args) {

    Zerg zerg = new Zerg();
    zerg.name = "Zerg";
    Zerg zerg1 = new Zerg();
    zerg1.name = "Zerg1";
    Zerg zerg2 = new Zerg();
    zerg2.name = "Zerg2";
    Zerg zerg3 = new Zerg();
    zerg3.name = "Zerg3";
    Zerg zerg4 = new Zerg();
    zerg4.name = "Zerg4";

    Protoss protoss = new Protoss();
    protoss.name = "Protoss";
    Protoss protoss1 = new Protoss();
    protoss1.name = "Protoss1";
    Protoss protoss2 = new Protoss();
    protoss2.name = "Protoss2";

    Terran terran = new Terran();
    terran.name = "Terran";
    Terran terran1 = new Terran();
    terran1.name = "Terran1";
    Terran terran2 = new Terran();
    terran2.name = "Terran2";
    Terran terran3 = new Terran();
    terran3.name = "Terran3";

  }

  public static class Zerg {
    public String name;
  }

  public static class Protoss {
    public String name;
  }

  public static class Terran {
    public String name;
  }
}
