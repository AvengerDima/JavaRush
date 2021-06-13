package Level_2;

/*
Формируем WHERE
*/

import java.util.LinkedHashMap;
import java.util.Map;

public class lvl_2_task_8 {
    public static void main(String[] args) {
        Map<String, String> testMap = new LinkedHashMap<>();
        testMap.put("name", "Ivanov");
        testMap.put("country", "Ukraine");
        testMap.put("city", "Kiev");
        testMap.put("age", null);
        System.out.println(getQuery(testMap));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder stringBuilder = new StringBuilder();

        for (Map.Entry entry : params.entrySet()) {
            if (entry.getValue() != null) {
                if (stringBuilder.toString().equals("")) {
                    stringBuilder.append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
                } else {
                    stringBuilder.append(" and ").append(entry.getKey()).append(" = '").append(entry.getValue()).append("'");
                }
            }

        }

        return stringBuilder.toString();
    }
}
