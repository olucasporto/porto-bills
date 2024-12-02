package br.com.portobills.model;

import java.util.logging.Logger;

public class Income extends Account {

    private Income(String name, double amount) {
        super(name, amount);
    }

    public static Income create(String name, double amount) {
        return new Income(name, amount);
    }

    @Override
    public String getType() {
        return "Receita";
    }

    @Override
    public void showLog(Logger logger) {
        logger.info(formatLog());
    }
}
