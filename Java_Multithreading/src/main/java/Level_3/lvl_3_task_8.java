package Level_3;

/*
Рефакторинг, вложенные классы
*/

public class lvl_3_task_8 {
    public class ServerNotAccessibleException extends Exception {
        public ServerNotAccessibleException() {
            super("The server is currently not accessible.");
        }

        public ServerNotAccessibleException(Throwable cause) {
            super("The server is currently not accessible.", cause);
        }
    }

    public class UnauthorizedUserException extends Exception {
        public UnauthorizedUserException() {
            super("The user is not authorized.");
        }

        public UnauthorizedUserException(Throwable cause) {
            super("The user is not authorized.", cause);
        }
    }

    public class BannedUserException extends Exception {
        public BannedUserException() {
            super("The user is banned.");
        }

        public BannedUserException(Throwable cause) {
            super("The user is banned.", cause);
        }
    }

    public class RestrictionException extends Exception {
        public RestrictionException() {
            super("Access is denied.");
        }

        public RestrictionException(Throwable cause) {
            super("Access is denied.", cause);
        }
    }

    public static final class Constants {
        public final static String SERVER_IS_CURRENTLY_NOT_ACCESSIBLE = "The server is not currently accessible.";
        public final static String USER_IS_NOT_AUTHORIZED = "The user is not authorized.";
        public final static String USER_IS_BANNED = "The user is banned.";
        public final static String ACCESS_IS_DENIED = "Access is denied.";
    }

    public static void main(String[] args) {

    }
}
