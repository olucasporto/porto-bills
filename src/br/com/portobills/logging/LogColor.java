package br.com.portobills.logging;

public enum LogColor {
    RESET("\u001B[0m"),
    RED("\u001B[31m"),
    GREEN("\u001B[32m"),
    YELLOW("\u001B[33m"),
    BLUE("\u001B[34m");

    private final String ansiCode;

    LogColor(String ansiCode) {
        this.ansiCode = ansiCode;
    }

    public String getAnsiCode() {
        return ansiCode;
    }

    public String apply(String message) {
        return this.ansiCode + message + RESET.ansiCode;
    }
}
