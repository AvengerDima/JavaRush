package Level_7.lvl_7_task_22;

/*
CRUD 2
*/

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class lvl_7_task_22 {
  public static volatile List<Person> allPeople = new ArrayList<Person>();

  static {
    allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
    allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
  }

  public static void main(String[] args) throws ParseException {
    //start here - начни тут
    SimpleDateFormat formatIn = new SimpleDateFormat("dd/MM/yyyy");
    SimpleDateFormat formatOut = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);

    switch (args[0]){
      case "-c":
        synchronized (allPeople){
          for (int i = 1; i < args.length; i += 3) {
            if (args[i + 1].equals("м"))
              allPeople.add(Person.createMale(args[i], formatIn.parse(args[i + 2])));
            else if (args[i + 1].equals("ж"))
              allPeople.add(Person.createFemale(args[i], formatIn.parse(args[i + 2])));
            System.out.println(allPeople.size() - 1);
          }
        }
        break;

      case "-u":
        synchronized (allPeople){
          for (int i = 1; i < args.length; i += 4) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(args[i+1]);
            person.setSex((args[i+2].equals("м")) ? Sex.MALE : Sex.FEMALE);
            person.setBirthDate(formatIn.parse(args[i+3]));
          }
        }
        break;

      case "-d":
        synchronized (allPeople){
          for (int i = 1; i < args.length; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            person.setName(null);
            person.setSex(null);
            person.setBirthDate(null);
          }
        }
        break;

      case "-i":
        synchronized (allPeople){
          for (int i = 1; i < args.length; i++) {
            Person person = allPeople.get(Integer.parseInt(args[i]));
            String name = person.getName();
            String sex = (person.getSex() == Sex.MALE)? "м" : "ж";
            String bd = formatOut.format(person.getBirthDate());

            //Перевод строки!!!!
            System.out.printf("%s %s %s \n", name, sex, bd);
          }
        }
        break;
    }
  }
}
