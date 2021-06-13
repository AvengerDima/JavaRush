package Level_9;

/*
Самый богатый
*/

import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class lvl_9_task_20 {
    public static void main(String[] args) throws IOException {
        FileReader freader = new FileReader(args[0]);
        StringBuilder builder = new StringBuilder();
        while (freader.ready()) {
            builder.append((char)freader.read());
        }
        freader.close();

        String strarray[] = builder.toString().split("[\\r\\n\\s]+");
        HashMap<String,Double> map = new HashMap<>();

        for(int i=0; i<strarray.length; i+=2) {
            map.put(strarray[i], 0.0);
        }
        for(int i=1; i<strarray.length; i+=2) {
            map.replace(strarray[i - 1], map.get(strarray[i - 1]) + Double.parseDouble(strarray[i]));
        }
        double max = Double.parseDouble(strarray[1]);
        String name = "";
        for (HashMap.Entry<String,Double> entry: map.entrySet()) {
            if (entry.getValue()>max) {
                max = entry.getValue(); name = entry.getKey();
            }
        }
        for (HashMap.Entry<String,Double> entry: map.entrySet()) {
            if (entry.getValue()>max) {
                max = entry.getValue(); name = entry.getKey();
            }
        }
        for (HashMap.Entry<String,Double> entry: map.entrySet()) {
            if (entry.getValue().equals(max)) {
                System.out.println(entry.getKey());
            }
        }
    }
}
