package Level_4;

/*
Клининговый центр
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_4_task_15 {
  public static void main(String[] args) {
    List<Apartment> apartments = new ArrayList<Apartment>();
    apartments.add(new OneRoomApt());
    apartments.add(new TwoRoomApt());
    apartments.add(new ThreeRoomApt());

    cleanAllApartments(apartments);
  }

  public static void cleanAllApartments(List<Apartment> apartments) {
    //написать тут вашу реализацию пунктов 1-4
    for (int i = 0; i < apartments.size(); i++) {
      if (apartments.get(i) instanceof OneRoomApt) {
        ((OneRoomApt) apartments.get(i)).clean1Room();
      } else if (apartments.get(i) instanceof TwoRoomApt) {
        ((TwoRoomApt) apartments.get(i)).clean2Rooms();
      } else if (apartments.get(i) instanceof ThreeRoomApt) {
        ((ThreeRoomApt) apartments.get(i)).clean3Rooms();
      }
    }
  }

  static interface Apartment {
  }

  static class OneRoomApt implements Apartment {
    void clean1Room() {
      System.out.println("1 room is cleaned");
    }
  }

  static class TwoRoomApt implements Apartment {
    void clean2Rooms() {
      System.out.println("2 rooms are cleaned");
    }
  }

  static class ThreeRoomApt implements Apartment {
    void clean3Rooms() {
      System.out.println("3 rooms are cleaned");
    }
  }
}
