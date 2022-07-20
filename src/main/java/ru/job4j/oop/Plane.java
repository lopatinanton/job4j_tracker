package ru.job4j.oop;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println(getClass().getSimpleName() + " максимальная скорость: 685 км/ч");
    }

    @Override
    public void passengers() {
        System.out.println(getClass().getSimpleName() + " максимальная количество пассажиров: 500");
    }
}
