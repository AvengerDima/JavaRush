package Level_2;

/*
Проверка номера телефона
*/

public class lvl_2_task_10 {
    public static boolean checkTelNumber(String telNumber) {
        if (telNumber == null) {
            return false;
        }

        return telNumber.matches(
                "^([+][0-9]{12})|"
                        + "([+][0-9]{2}([(]([0-9]{3})[)][0-9]{7}))|"
                        + "([+][0-9]{8}(-[0-9]{2}){2})|"
                        + "(([0-9]{6})-[0-9]{4})|"
                        + "([0-9]{10})$"
        );
    }

    public static void main(String[] args) {

    }
}
