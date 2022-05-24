package ru.job4j;

public class Salary {
    public static int calculate(int[] hours) {
        int salary = 0;
        for (int i = 0; i < hours.length; ++i) {
            salary +=  (i > 4 ? 2 : 1) * (hours[i] * 10 + Math.max(0, hours[i] - 8) * 5);
        }
        return salary;
    }
}
