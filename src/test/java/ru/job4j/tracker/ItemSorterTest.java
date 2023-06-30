package ru.job4j.tracker;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

public class ItemSorterTest {
    @Test
    public  void sortInDescending() {
        List<Item> items = Arrays.asList(
                new Item("AS"),
                new Item("BS"),
                new Item("MS")
        );
        List<Item> expected = Arrays.asList(
                new Item("MS"),
                new Item("BS"),
                new Item("AS")
        );
        items.sort(new ItemDescByName());
        assertThat(items).isEqualTo(expected);
    }

    @Test
    public void sortINAscending() {
        List<Item> items = Arrays.asList(
                new Item("Job"),
                new Item("vacancy"),
                new Item("office")
        );
        List<Item> expected = Arrays.asList(
                new Item("Job"),
                new Item("office"),
                new Item("vacancy")
        );
        items.sort(new ItemAscByName());
        assertEquals(items, expected);
    }
}
