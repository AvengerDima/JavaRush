package Level_7.lvl_7_task_6;

/*
Синхронизированный президент
*/

public class lvl_7_task_6 {
  public static void main(String[] args) {
    OurPresident expectedPresident = OurPresident.getOurPresident();
    OurPresident ourPresident = OurPresident.getOurPresident();
    System.out.println(expectedPresident == ourPresident );
  }
}
