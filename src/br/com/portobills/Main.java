package br.com.portobills;

import br.com.portobills.config.LogSetup;
import br.com.portobills.model.Category;
import br.com.portobills.model.Debt;
import br.com.portobills.model.Income;
import br.com.portobills.util.AccountLogger;

public class Main {

    public static void main(String[] args) {
        LogSetup.setup();
        AccountLogger.log(
                Debt.create("Aluguel", 9000.00)
                        .on("02/12/24 00:00")
                        .addCategory(Category.RENT)
                        .addCategory(Category.MONTHLY)
                        .withObservation("Paga por transferência")
        );

        AccountLogger.log(
                Debt.create("Cartão de Crédito", 80000.00)
                        .on("15/12/24 00:00")
                        .addCategory(Category.EXPENSES)
                        .withObservation("Pagamento mínimo")
        );

        AccountLogger.log(
                Income.create("Salário", 90000.00)
                        .on("01/12/24 00:00")
                        .addCategory(Category.WORK)
                        .addCategory(Category.MONTHLY)
                        .withObservation("Empresa XPTO")
        );

        AccountLogger.log(
                Income.create("Freelance", 1200.00)
                        .on("10/12/24 00:00")
                        .addCategory(Category.EXTRA)
                        .withObservation("Projeto finalizado")
        );

        AccountLogger.showLogs();
    }


}
