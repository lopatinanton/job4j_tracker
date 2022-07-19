package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void drive() {
        System.out.println("Автобус следует по маршруту: 56 ");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Количество пассажиров: " + number);
    }

    @Override
    public double refuel(double volume, double price) {
        price = volume * 52;
        return price;
    }
}
