package ru.job4j.checkstyle;

public class Broken {
    public static final String NEW_VALUE = "";
    public int sizeOfEmpty = 10;
    public String surname;

    Broken() {
    }

    void echo() {
    }

    void media(Object obj) {
        String name;
        if (obj != null) {
            System.out.println(obj);
        }
    }

    void method(int a, int b, int c, int d, int e, int f, int g) {
    }
}