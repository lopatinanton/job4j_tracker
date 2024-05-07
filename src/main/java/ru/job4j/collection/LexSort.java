package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        String[] partstring = left.split("\\. ");
        String[] sortstring = right.split("\\. ");
        return Integer.compare(Integer.parseInt(partstring[0]), Integer.parseInt(sortstring[0]));
    }
}
