package Level_3.lvl_3_task_28;

/*
Битва роботов
*/

public class lvl_3_task_28 {
  public static void main(String[] args) {
    Robot amigo = new Robot("Амиго");
    Robot enemy = new Robot("Сгибальщик-02");

    doMove(amigo, enemy);
    doMove(amigo, enemy);
    doMove(enemy, amigo);
    doMove(amigo, enemy);
    doMove(enemy, amigo);
    doMove(amigo, enemy);
    doMove(enemy, amigo);
    doMove(amigo, enemy);
  }

  public static void doMove(AbstractRobot robotFirst, AbstractRobot robotSecond) {
    BodyPart attacked = robotFirst.attack();
    BodyPart defenced = robotFirst.defense();
    System.out.println(String.format("%s атаковал робота %s, атакована %s, защищена %s",
            robotFirst.getName(), robotSecond.getName(), attacked, defenced));
  }
}
