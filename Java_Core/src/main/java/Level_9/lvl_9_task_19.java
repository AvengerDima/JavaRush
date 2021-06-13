package Level_9;

/*
Считаем зарплаты
*/

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class lvl_9_task_19 {
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new FileReader(args[0]));
        HashMap<String, Double> map = new HashMap<String, Double>();
        Double value;

        while (in.ready()){
            String[] line = in.readLine().split(" ");
            value = Double.parseDouble(line[1]);

            if (map.containsKey(line[0])){
                value = value + map.get(line[0]);
                map.put(line[0], value);
            }
            else {
                map.put(line[0], value);
            }
        }
        in.close();

        Map<String, Double> sortedMap = new TreeMap<String, Double>(String.CASE_INSENSITIVE_ORDER);
        sortedMap.putAll(map);

        for (Map.Entry<String, Double> entry: sortedMap.entrySet()){
            System.out.println(entry.getKey()+ " " + entry.getValue());
        }
    }
}
