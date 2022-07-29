package ru.job4j.ex;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class FactTest {

    @Test
    public void whenNegativeThenException() {
        IllegalArgumentException negative = Assertions.assertThrows(
                IllegalArgumentException.class,
                () -> {
                    Fact.calc(-1); });
        Assertions.assertEquals("N could not be less then 0", negative.getMessage());
    }
}