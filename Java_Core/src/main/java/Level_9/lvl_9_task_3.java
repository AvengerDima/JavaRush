package Level_9;

/*
Адаптация нескольких интерфейсов
*/

import java.util.HashMap;
import java.util.Map;

public class lvl_9_task_3 {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {
        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            return countries.get(data.getCountryCode());
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String phoneNum = String.valueOf(data.getPhoneNumber());

            while (phoneNum.length() < 10){
                phoneNum = "0" + phoneNum;
            }

            String newPhoneNumber = "(" + String.valueOf(phoneNum).substring(0, 3) + ")";
            newPhoneNumber += String.valueOf(phoneNum).substring(3, 6);
            newPhoneNumber += "-" + String.valueOf(phoneNum).substring(6, 8);
            newPhoneNumber += "-" + String.valueOf(phoneNum).substring(8);

            return "+" + data.getCountryPhoneCode() + newPhoneNumber;
        }
    }


    public static interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example: 501234567
    }

    public static interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public static interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example: +38(050)123-45-67
    }
}
