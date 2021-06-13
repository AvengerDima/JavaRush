package Level_9.lvl_9_task_21;

/*
Хуан Хуанович
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.List;

public class lvl_9_task_21 {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws Exception {
        String fileName = args[0];
        BufferedReader fReader = new BufferedReader(new FileReader(fileName));

        StringBuilder name;
        int year, month, day;
        String line;
        while ((line = fReader.readLine()) != null) {
            String[] rec = line.split(" ");
            year = Integer.parseInt(rec[rec.length - 1]);
            month = Integer.parseInt(rec[rec.length - 2]) - 1;
            day = Integer.parseInt(rec[rec.length - 3]);
            name = new StringBuilder();
            for (int i = 0; i < rec.length - 3; i++) {
                name.append(rec[i]).append(" ");
            }
            name.replace(name.length() - 1, name.length(), "");

            PEOPLE.add(new Person(name.toString(), new GregorianCalendar(year, month, day).getTime()));
        }

        fReader.close();
    }
}
