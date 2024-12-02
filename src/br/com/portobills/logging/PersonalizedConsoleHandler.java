package br.com.portobills.logging;

import java.util.logging.ConsoleHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;

public class PersonalizedConsoleHandler extends ConsoleHandler {
    public PersonalizedConsoleHandler() {
        setLevel(Level.ALL); // Define que o handler processará todos os níveis
    }

    @Override
    protected void setOutputStream(java.io.OutputStream out) {
        super.setOutputStream(System.out); // Redireciona para o console
    }

    @Override
    public void publish(LogRecord record) {
        String message = record.getMessage();

        if (record.getLevel() == Level.SEVERE) {
            message = LogColor.RED.apply(message);
        } else if (record.getLevel() == Level.WARNING) {
            message = LogColor.YELLOW.apply(message);
        } else if (record.getLevel() == Level.INFO) {
            message = LogColor.GREEN.apply(message);
        }

        record.setMessage(message);
        super.publish(record);
    }
}
