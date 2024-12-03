package br.com.portobills.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class PersonalizedConsoleHandler extends ConsoleHandler {

    public PersonalizedConsoleHandler() {
        setLevel(Level.ALL);
        setFormatter(new CustomLogFormatter());
    }

    @Override
    protected void setOutputStream(java.io.OutputStream out) {
        super.setOutputStream(System.out);
    }

    @Override
    public void publish(LogRecord record) {
        if (!isLoggable(record)) {
            return;
        }
        String originalMessage = record.getMessage();
        record.setMessage(getColoredMessage(record, originalMessage));
        super.publish(record);
    }

    private static String getColoredMessage(LogRecord record, String originalMessage) {
        if (record.getLevel() == Level.SEVERE) {
            return LogColor.RED.apply(originalMessage);
        } else if (record.getLevel() == Level.WARNING) {
            return LogColor.YELLOW.apply(originalMessage);
        } else if (record.getLevel() == Level.INFO) {
            return LogColor.GREEN.apply(originalMessage);
        }
        return originalMessage;
    }
}
