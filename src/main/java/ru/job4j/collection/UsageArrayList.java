package ru.job4j.collection;

import java.util.ArrayList;
import java.util.Collection;

public class UsageArrayList {
    public static void main(String[] args) {
        Collection<String> names = new ArrayList<>();
        names.add("Petr");
        names.add("Ivan");
        names.add("Stepan");
        for (String s : names) {
            System.out.println(s);
        }
    }

}
