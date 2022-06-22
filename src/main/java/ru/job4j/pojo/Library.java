package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book one = new Book("Red", 54);
        Book two = new Book("Yellow", 34);
        Book three = new Book("Green", 567);
        Book four = new Book("Clean code", 345);
        Book[] books = new Book[4];
        books[0] = one;
        books[1] = two;
        books[2] = three;
        books[3] = four;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getCount() + " pages");
        }
        System.out.println();
        System.out.println("Reverse one to four.");
        Book tmp = books[0];
        books[0] = books[3];
        books[3] = tmp;
        for (Book bk : books) {
            System.out.println(bk.getName() + " - " + bk.getCount() + " pages");
        }
        System.out.println();
        System.out.println("Output of a book with the name Clean code");
        for (Book bk : books) {
            if (bk.equals(four)) {
                System.out.println(bk.getName() + " - " + bk.getCount() + " pages");
            }
        }
    }
}
