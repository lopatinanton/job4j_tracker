package ru.job4j.inheritance;

public abstract class TextReport {
    public String generate(String name, String body) {
        return "{" + System.lineSeparator() + "\t\"name\"" + " : \"" + name + "\"" + "," + System.lineSeparator()
                + "\t\"body\"" + " : \"" + body + "\"" + System.lineSeparator() + "}";
    }

    public abstract String genreate(String name, String body);
}
