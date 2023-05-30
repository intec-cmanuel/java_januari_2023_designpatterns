package be.intecbrussel.singletonpattern;

import java.util.ArrayList;
import java.util.List;

public final class Logger {
    private static Logger logger;

    public static Logger getLogger() {
        if (logger == null) {
            logger = new Logger();
        }

        return logger;
    }

    private Logger() {
        this.logs = new ArrayList<>();
    }






    private List<String> logs;

    public void log(String log) {
        logs.add(log);
    }

    public void printLogs() {
        logs.forEach(System.out::println);
    }
}
