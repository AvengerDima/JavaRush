package Level_3;

/*
Десериализация JSON объекта
*/

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class lvl_3_task_3 {
    public static <T> T convertFromJsonToNormal(String fileName, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        return mapper.readValue(new FileReader(new File(fileName)), clazz);
    }

    public static void main(String[] args) {

    }
}
