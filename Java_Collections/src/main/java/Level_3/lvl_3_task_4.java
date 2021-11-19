package Level_3;

/*
Конвертация из одного класса в другой используя JSON Ӏ 3304
*/

import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class lvl_3_task_4 {
    public static void main(String[] args) throws IOException {
        Second s = (Second) convertOneToAnother(new First(), Second.class);
        First f = (First) convertOneToAnother(new Second(), First.class);
    }

    public static Object convertOneToAnother(Object one, Class resultClassObject) throws IOException {
        StringWriter writer = new StringWriter();
        ObjectMapper mapper1 = new ObjectMapper();
        mapper1.writeValue(writer, one);
        String ss = writer.toString();
        String key1 = "\"" + one.getClass().getSimpleName().toLowerCase() + "\"";
        String key2 = "\"" + resultClassObject.getSimpleName().toLowerCase() + "\"";
        ss = ss.replaceFirst(key1, key2);

        StringReader reader = new StringReader(ss);
        ObjectMapper mapper2 = new ObjectMapper();
        return mapper2.readValue(reader, resultClassObject);
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
    @JsonSubTypes(@JsonSubTypes.Type(value = First.class, name = "first"))
    public static class First {
        public int i;
        public String name;
    }

    @JsonTypeInfo(use = JsonTypeInfo.Id.NAME, property = "className")
    @JsonSubTypes(@JsonSubTypes.Type(value = Second.class, name = "second"))
    public static class Second {
        public int i;
        public String name;
    }
}
