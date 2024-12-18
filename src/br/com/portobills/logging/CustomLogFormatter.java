package br.com.portobills.logging;

import java.util.logging.Formatter;
import java.util.logging.LogRecord;

public class CustomLogFormatter extends Formatter {

    @Override
    public String format(LogRecord record) {
        return record.getMessage() + System.lineSeparator();
    }
}
