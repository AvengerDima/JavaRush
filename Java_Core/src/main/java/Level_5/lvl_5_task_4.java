package Level_5;

/*
ООП - книги
*/

import java.util.LinkedList;
import java.util.List;

public class lvl_5_task_4 {
  public static void main(String[] args) {
    List<Book> books = new LinkedList<Book>();
    books.add(new MarkTwainBook("Tom Sawyer"));
    books.add(new AgathaChristieBook("Hercule Poirot"));
    System.out.println(books);
  }

  public static class MarkTwainBook extends Book {
    String title;

    public MarkTwainBook(String title) {
      super("Mark Twain");
      this.title = title;
    }

    @Override
    public MarkTwainBook getBook() {
      return this;
    }

    @Override
    public String getTitle() {
      return title;
    }
  }

  public static class AgathaChristieBook extends Book {
    String title;

    public AgathaChristieBook(String title) {
      super("Agatha Christie");

      this.title = title;
    }

    @Override
    public AgathaChristieBook getBook() {
      return this;
    }

    @Override
    public String getTitle() {
      return title;
    }
  }

  abstract static class Book {
    private String author;

    public Book(String author) {
      this.author = author;
    }

    public abstract Book getBook();

    public abstract String getTitle();

    private String getOutputByBookType() {
      String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
      String markTwainOutput = getBook().getTitle() + " was written by " + author;

      String output = "output";
      //Add your code here
      if ("Mark Twain".equals(author))
        output = markTwainOutput;
      else if ("Agatha Christie".equals(author))
        output = agathaChristieOutput;
      return output;
    }

    public String toString() {
      return getOutputByBookType();
    }
  }
}
