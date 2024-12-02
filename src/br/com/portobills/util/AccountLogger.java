package br.com.portobills.util;

import br.com.portobills.Main;
import br.com.portobills.logging.LogColor;
import br.com.portobills.model.Account;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public class AccountLogger {
    private static final List<Account> accounts = new ArrayList<>();
    private static final Logger logger = Logger.getLogger(Main.class.getName());

    public static void log(Account account) {
        accounts.add(account);
    }

    public static void showLogs() {
        logger.info(LogColor.BLUE.apply("==== LOG DAS TRANSAÇÕES ===="));
        for (Account account : accounts) {
            account.showLog(logger);
            logger.warning("----------------------------");
        }
    }
}
