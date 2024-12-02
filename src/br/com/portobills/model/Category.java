package br.com.portobills.model;

public enum Category {
    FOOD("Alimentação"), RENT("Aluguel"), MONTHLY("Mensal"), EXPENSES("Despesas"), WORK("Trabalho"), EXTRA("Extra");

    private final String ptBr;

    Category(String ptBr) {
        this.ptBr = ptBr;
    }

    public String getTranslation() {
        return ptBr;
    }
}
