package br.com.portobills.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

public abstract class Account {
    private String name;
    private BigDecimal amount;
    private LocalDateTime date;
    private List<Category> categories;
    private String observation;

    protected Account(String name, double amount) {
        this.name = name;
        this.amount = BigDecimal.valueOf(amount);
        this.categories = new ArrayList<>();
    }

    public Account on(String date) {
        this.date = LocalDateTime.parse(date, DateTimeFormatter.ofPattern("dd/MM/yy HH:mm"));
        return this;
    }

    public Account addCategory(Category category) {
        this.categories.add(category);
        return this;
    }

    public Account withObservation(String observation) {
        this.observation = observation;
        return this;
    }

    public abstract String getType();

    public String formatLog() {
        return String.format("[%s] %s - R$ %.2f%nData/Hora: %s%nCategorias: %s%nObservação: %s%n",
                getType(),
                name,
                amount,
                date != null ? date.format(DateTimeFormatter.ofPattern("dd/MM/yy HH:mm")) : "Não especificada",
                categories.isEmpty() ? "Nenhuma" : String.join(", ", categories.stream().map(Category::getTranslation).toList()),
                observation != null ? observation : "Nenhuma");
    }

    public abstract void showLog(Logger logger);
}
