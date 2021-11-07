package Level_2;

/*
Шифр Цезаря
*/

import java.io.IOException;
import java.io.StringReader;

public class lvl_2_task_5 {
    public static void main(String[] args) throws IOException {
        StringReader reader = new StringReader("Khoor#Dpljr#&C,₷B'3");
        System.out.println(decode(reader, -3));  //Hello Amigo #@)₴?$0
    }

    public static String decode(StringReader reader, int key) throws IOException {
        StringBuilder builder = new StringBuilder();
        int ch1;
        if (reader != null) {
            while ((ch1 = reader.read()) != -1) {
                char ch = (char) ch1;
                builder.append((char) (ch + key));
            }
        }
        return builder.toString();
    }
}
