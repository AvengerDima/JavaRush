package Level_2;

/*
Найти подстроку
*/

public class lvl_2_task_1 {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
    }

    public static String getPartOfString(String string) {
        String newString = "";
        try {
            String[] s = string.split(" ");
            for (int i = 1 ; i < 5 ; i++) {
                newString = newString + " " + s[i];

            }

            return newString.trim();
        } catch (RuntimeException e) {
            throw new TooShortStringException();
        }
    }

    public static class TooShortStringException extends RuntimeException {
    }
}
