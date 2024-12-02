package br.com.portobills.model;

import java.util.logging.Logger;

public class Debt extends Account {

    private Debt(String name, double amount) {
        super(name, amount);
    }

    public static Debt create(String name, double amount) {
        return new Debt(name, amount);
    }

    @Override
    public String getType() {
        return "Dívida";
    }

    @Override
    public void showLog(Logger logger) {
        logger.severe(formatLog());
    }
}
