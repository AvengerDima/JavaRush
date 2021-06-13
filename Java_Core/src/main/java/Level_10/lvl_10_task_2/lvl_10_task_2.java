package Level_10.lvl_10_task_2;

/*
Читаем и пишем в файл: JavaRush
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class lvl_10_task_2 {
    public static void main(String[] args) {
        //you can find your_file_name.tmp in your TMP directory or adjust outputStream/inputStream according to your file's actual location
        //вы можете найти your_file_name.tmp в папке TMP или исправьте outputStream/inputStream в соответствии с путем к вашему реальному файлу
        try {
            File yourFile = File.createTempFile("your_file_name", null);
            OutputStream outputStream = new FileOutputStream(yourFile);
            InputStream inputStream = new FileInputStream(yourFile);

            JavaRush javaRush = new JavaRush();
            //initialize users field for the javaRush object here - инициализируйте поле users для объекта javaRush тут
            javaRush.save(outputStream);
            outputStream.flush();

            JavaRush loadedObject = new JavaRush();
            loadedObject.load(inputStream);
            //here check that the javaRush object is equal to the loadedObject object - проверьте тут, что javaRush и loadedObject равны

            outputStream.close();
            inputStream.close();

        } catch (IOException e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with my file");
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Oops, something is wrong with the save/load method");
        }
    }

    public static class JavaRush {
        public List<User> users = new ArrayList<>();

        public void save(OutputStream outputStream) throws Exception {
            //implement this method - реализуйте этот метод
            DataOutputStream dOS = new DataOutputStream(outputStream);
            dOS.writeInt(users.size());
            for (User user : users) {
                String firstname = (user.getFirstName() == null) ? "null" : user.getFirstName();
                dOS.writeUTF(firstname);
                String lastname = (user.getLastName() == null) ? "null" : user.getLastName();
                dOS.writeUTF(lastname);
                dOS.writeLong(user.getBirthDate().getTime());
                dOS.writeBoolean(user.isMale());
                dOS.writeUTF(user.getCountry().name());
            }
            dOS.flush();
        }

        public void load(InputStream inputStream) throws Exception {
            //implement this method - реализуйте этот метод
            DataInputStream dIS = new DataInputStream(inputStream);
            int usersCount = dIS.readInt();
            for (int i = 0; i < usersCount; i++) {
                User user = new User();
                String firstname = dIS.readUTF();
                if (firstname.equals("null")) firstname = null;
                user.setFirstName(firstname);
                String lastname = dIS.readUTF();
                if (lastname.equals("null")) lastname = null;
                user.setLastName(lastname);
                user.setBirthDate(new Date(dIS.readLong()));
                user.setMale(dIS.readBoolean());
                user.setCountry(User.Country.valueOf(dIS.readUTF()));
                this.users.add(user);
            }
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;

            JavaRush javaRush = (JavaRush) o;

            return users != null ? users.equals(javaRush.users) : javaRush.users == null;

        }

        @Override
        public int hashCode() {
            return users != null ? users.hashCode() : 0;
        }
    }
}
