package Level_9;

/*
Список из массивов чисел
*/

import java.util.ArrayList;

public class lvl_9_task_26 {
  public static void main(String[] args) {
    ArrayList<int[]> list = createList();
    printList(list);
  }

  public static ArrayList<int[]> createList() {
    //напишите тут ваш код
    ArrayList<int[]> array = new ArrayList();
    int[] array1 = new int[5];
    int[] array2 = new int[2];
    int[] array3 = new int[4];
    int[] array4 = new int[7];
    int[] array5 = new int[0];
    for(int i = 0; i < array1.length; i++){
      array1[i] = i;
    }
    for(int i = 0; i < array2.length; i++){
      array2[i] = i;
    }
    for(int i = 0; i < array3.length; i++){
      array3[i] = i;
    }
    for(int i = 0; i < array4.length; i++){
      array4[i] = i;
    }
    array.add(0,array1);
    array.add(array2);
    array.add(array3);
    array.add(array4);
    array.add(array5);

    return array;
  }

  public static void printList(ArrayList<int[]> list) {
    for (int[] array : list) {
      for (int x : array) {
        System.out.println(x);
      }
    }
  }
}
