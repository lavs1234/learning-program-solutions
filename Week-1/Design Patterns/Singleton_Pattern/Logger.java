public class Logger {

    private static Logger singleInstance;

    private Logger() {
        System.out.println("Logger Initialized.");
    }

    public static Logger getInstance() {
        if (singleInstance == null) {
            singleInstance = new Logger();
        }
        return singleInstance;
    }

    public void logMessage(String message) {
        System.out.println("LOG: " + message);
    }
}