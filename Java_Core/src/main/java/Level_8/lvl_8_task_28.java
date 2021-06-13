package Level_8;

/*
Прайсы 2
*/

import java.io.*;
import java.util.ArrayList;

public class lvl_8_task_28 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = null;
        try {
            fileName = reader.readLine();
            reader.close();
        } catch (Exception e) {

        }

        if ("-u".equals(args[0])) {
            update(fileName, args[1], args[2], args[3], args[4]);
        } else if ("-d".equals(args[0])) {
            delete(fileName, args[1]);
        }

    }

    static void update(String fileName, String id, String productName, String price, String quantity) {
        String newLine = id + addSpaces(8, id.length()) + productName + addSpaces(30, productName.length());
        newLine = newLine + price + addSpaces(8, price.length()) + quantity + addSpaces(4, quantity.length());
        String str;
        try {
            BufferedReader fis = new BufferedReader(new FileReader(fileName));
            int idIntParam = Integer.parseInt(id);

            ArrayList<String> table = new ArrayList<>();
            while ((str = fis.readLine()) != null) {
                int idIntCurrent = Integer.parseInt(str.substring(0, 8).replaceAll(" ", "").replaceAll("\uFEFF", ""));
                if (idIntParam == idIntCurrent) {
                    table.add(newLine);
                } else {
                    table.add(str);
                }
            }
            fis.close();

            FileWriter fos = new FileWriter(fileName);

            for (String s : table) {
                fos.write(s);
                fos.append('\r');
                fos.append('\n');
            }
            fos.flush();
            fos.close();

        } catch (Exception e) {
        }
    }

    static void delete(String fileName, String id) {
        String str;
        try {
            BufferedReader fis = new BufferedReader(new FileReader(fileName));
            int idIntParam = Integer.parseInt(id);

            ArrayList<String> table = new ArrayList<>();
            while ((str = fis.readLine()) != null) {
                int idIntCurrent = Integer.parseInt(str.substring(0, 8).replaceAll(" ", "").replaceAll("\uFEFF", ""));
                if (idIntParam == idIntCurrent) {
                    continue;
                } else {
                    table.add(str);
                }
            }
            fis.close();

            FileWriter fos = new FileWriter(fileName);

            for (String s : table) {
                fos.write(s);
                fos.append('\r');
                fos.append('\n');
            }
            fos.flush();
            fos.close();

        } catch (Exception e) {
        }
    }

    static String addSpaces(int lengthString, int currentLength) {
        int quantSpace = lengthString - currentLength;
        String spaces = null;
        try {
            if (quantSpace > 0) {
                for (int i = 0; i < quantSpace; i++) {
                    if (spaces == null) {
                        spaces = " ";
                    } else {
                        spaces += " ";}
                }
            }
        } catch(Exception e){

        }
        return spaces;
    }
}
