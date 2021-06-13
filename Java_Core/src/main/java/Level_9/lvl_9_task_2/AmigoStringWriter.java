package Level_9.lvl_9_task_2;

import java.io.IOException;

public interface AmigoStringWriter {
    void flush() throws IOException;
    void writeString(String s) throws IOException;
    void close() throws IOException;
}
