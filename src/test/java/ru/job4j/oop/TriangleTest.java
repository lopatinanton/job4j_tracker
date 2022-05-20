package ru.job4j.oop;

import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.closeTo;

public class TriangleTest {

    @Test
    public void when00and40and04Then8() {
        Point a = new Point(0, 0);
        Point b = new Point(4, 0);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, closeTo(8, 0.001));
    }

    @Test
    public void when00and05and04ThenMinus1() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 5);
        Point c = new Point(0, 4);
        Triangle triangle = new Triangle(a, b, c);
        double result = triangle.area();
        assertThat(result, closeTo(-1, 0.001));
    }
}
