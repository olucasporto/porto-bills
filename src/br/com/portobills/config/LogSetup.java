package br.com.portobills.config;

import br.com.portobills.logging.PersonalizedConsoleHandler;

import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

public class LogSetup {
    public static void setup() {
        Logger rootLogger = Logger.getLogger("");

        // Remove os handlers padrão
        for (Handler handler : rootLogger.getHandlers()) {
            rootLogger.removeHandler(handler);
        }

        // Adiciona o handler customizado
        rootLogger.addHandler(new PersonalizedConsoleHandler());
        rootLogger.setLevel(Level.ALL); // Configura o nível global
    }
}