package Level_1.lvl_1_task_11;

/*
AutoCloseable и try-with-resources
*/

public class lvl_1_task_11 {
    public static void main(String[] args) {
        DBConnectionManager dbConnectionManager = new DBConnectionManager();

        try (FakeConnection fakeConnection = dbConnectionManager.getFakeConnection()) {
            System.out.println("Entering body of try block.");
            fakeConnection.usefulOperation();
            fakeConnection.unsupportedOperation();
        } catch (Exception e) {
        }
    }
}
