package Level_7;

/*
Comparable
*/

public class lvl_7_task_12 {
  private String name;      //название
  private float distance;   //расстояние
  private int quality;    //качество

  public synchronized int compareTo(lvl_7_task_12 o) {
    int result = 0;
    if(this.getQuality() != o.getQuality() || this.getDistance() != o.getDistance()){
      int distancePart1 = (int)(this.getDistance() * 1000 / (this.getDistance() + o.getDistance()));
      int distancePart2 = (int)(o.getDistance() * 1000 / (this.getDistance() + o.getDistance()));

      result = this.getQuality() * distancePart1 - o.getQuality() * distancePart2;
    }

    return result;
  }

  public lvl_7_task_12(String name, float distance, int quality) {
    this.name = name;
    this.distance = distance;
    this.quality = quality;
  }

  public synchronized String getName() {
    return name;
  }

  public synchronized void setName(String name) {
    this.name = name;
  }

  public synchronized float getDistance() {
    return distance;
  }

  public synchronized void setDistance(float distance) {
    this.distance = distance;
  }

  public synchronized int getQuality() {
    return quality;
  }

  public synchronized void setQuality(int quality) {
    this.quality = quality;
  }

  public synchronized static void main(String[] args) {

  }
}
