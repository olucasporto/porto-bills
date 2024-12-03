package br.com.portobills.config;

import br.com.portobills.logging.PersonalizedConsoleHandler;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogSetup {

    private LogSetup() {
        throw new IllegalStateException("Utility class");
    }

    public static void setup() {
        Logger rootLogger = Logger.getLogger("");
        for (Handler handler : rootLogger.getHandlers()) {
            rootLogger.removeHandler(handler);
        }
        rootLogger.addHandler(new PersonalizedConsoleHandler());
        rootLogger.setLevel(Level.ALL);
    }
}