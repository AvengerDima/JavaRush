package Level_7;

/*
Синхронизированные заметки
*/

import java.util.ArrayList;
import java.util.List;

public class lvl_7_task_3 {
  public static void main(String[] args) {

  }

  public static class Note {

    public final List<String> notes = new ArrayList<String>();

    public void addNote(int index, String note) {
      System.out.println("Сейчас будет добавлена заметка [" + note + "] На позицию " + index);
      synchronized (notes) {
        notes.add(index, note);
      }
      System.out.println("Уже добавлена заметка [" + note + "]");
    }

    public void removeNote(int index) {
      System.out.println("Сейчас будет удалена заметка с позиции " + index);
      String note;
      synchronized (notes) {
        note = notes.remove(index);
      }
      System.out.println("Уже удалена заметка [" + note + "] с позиции " + index);
    }
  }
}
