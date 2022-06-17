package ru.job4j.inheritance;

public class HtmlReport extends TextReport {

    @Override @Override
    public String genrate(String name, String body) {
        return "{" + System.lineSeparator() + "\t\"name\"" + " : \"" + name + "\"" + "," + System.lineSeparator()
                + "\t\"body\"" + " : \"" + body + "\"" + System.lineSeparator() + "}";
    }
}
