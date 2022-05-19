package ru.job4j.oop;

public class Calculator {
    private static int x = 5;

    public static int sum(int y) {
        return  x + y;
    }

    public static int minus(int z) {
        return x - z;
    }

    public int multiply(int a) {
        return  x * a;
    }

    public int divide(int b) {
        return  x / b;
    }

    public int sumAllOperation(int total) {
       return sum(total) + minus(total) + multiply(total) + divide(total);

    }

    public static void main(String[] args) {
        int resultSum = Calculator.sum(1);
        System.out.println(resultSum);
        int resultMinus = minus(1);
        System.out.println(resultMinus);
        Calculator calculator = new Calculator();
        int resultMultiply = calculator.multiply(1);
        System.out.println(resultMultiply);
        Calculator calculator1 = new Calculator();
        int resultDivide = calculator1.divide(1);
        System.out.println(resultDivide);
        Calculator calculator2 = new Calculator();
        int rsl = calculator2.sumAllOperation(20);
        System.out.println(rsl);
    }
}
