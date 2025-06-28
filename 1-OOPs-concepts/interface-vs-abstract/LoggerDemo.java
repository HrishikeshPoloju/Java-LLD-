import java.util.*;

interface Logger {
    void log(String msg);
    default void info(String msg) {
        System.out.println("[INFO] " + msg);
    }
     static void help() {
        System.out.println("Logger interface is used for different types of logging.");
    }
}

class ConsoleLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("[Console] " + msg);
    }
}

class FileLogger implements Logger {
    @Override
    public void log(String msg) {
        System.out.println("[File] " + msg); 
    }
}

class LoggerDemo {
    public static void main(String[] args) {
        List<Logger> loggers = new ArrayList<>();
        loggers.add(new ConsoleLogger());
        loggers.add(new FileLogger());

        for (Logger logger : loggers) {
            logger.log("This is a log entry.");
            logger.info("Additional info log.");
        }

        Logger.help();
    }
}
