package Level_2;

/*
Да хоть на Луну!
*/

public class lvl_2_task_19 {
  public static void main(String[] args) {

    System.out.println(getWeight(888));
  }

  public static double getWeight(int earthWeight) {

    double w = earthWeight;
    double weight = w / 100 * 17;
    //System.out.println("Ваш вес на луне: " + weight);
    return weight;
  }
}
