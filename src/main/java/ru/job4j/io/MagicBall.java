package ru.job4j.io;

import java.util.Random;
import java.util.Scanner;

public class MagicBall {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Я великий Оракул. Что ты хочешь узнать? ");
        String user = input.nextLine();
        int answer = new Random().nextInt(3);
        if (answer < 2) {
            System.out.println(answer == 0 ? "Да" : "Нет");
        } else {
            System.out.println("Может быть");
        }
    }
}
