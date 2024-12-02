package br.com.portobills;

import br.com.portobills.logging.LogColor;
import br.com.portobills.config.LogSetup;

import java.util.logging.Logger;

public class Main {
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void main(String[] args) {
        LogSetup.setup();

        logger.info("Esta é uma mensagem INFO (Verde)");
        logger.warning("Esta é uma mensagem WARNING (Amarelo)");
        logger.severe("Esta é uma mensagem SEVERE (Vermelho)");
        logger.info(LogColor.BLUE.apply("Esta é uma mensagem INFO com Azul personalizada!"));
    }
}
