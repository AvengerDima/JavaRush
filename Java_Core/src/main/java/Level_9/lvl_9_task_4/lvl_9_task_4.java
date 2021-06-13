package Level_9.lvl_9_task_4;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/*
И еще один адаптер
*/

public class lvl_9_task_4 {
    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner){
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
            String str = fileScanner.nextLine();
            String[] split = str.split(" ");

            Calendar calendar = new GregorianCalendar(Integer.parseInt(split[5]), Integer.parseInt(split[4]) - 1, Integer.parseInt(split[3]));
            Date date = calendar.getTime();
            Person person = new Person(split[1], split[2], split[0], date);
            return person;
        }

        @Override
        public void close() throws IOException {
            this.fileScanner.close();
        }
    }

    public static void main(String[] args) {
    }
}
