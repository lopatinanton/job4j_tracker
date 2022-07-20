package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " максимальная скорость: 290 км/ч");
    }

    @Override
    public void passengers() {
        System.out.println(getClass().getSimpleName() + " максимальная количество пассажиров: 359");
    }
}
