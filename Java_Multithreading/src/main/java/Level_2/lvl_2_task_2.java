package Level_2;

/*
Между табуляциями
*/

public class lvl_2_task_2 {
    public static String getPartOfString(String string) throws TooShortStringException {
        try {
            String s[] = string.split("\t");
            String str = s[1];
            if (s.length < 3) {
                throw new TooShortStringException();
            }
            return str;
        } catch (Exception e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends Exception {
    }

    public static void main(String[] args) throws TooShortStringException {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }
}
