package ru.job4j.tracker;

import java.util.Arrays;

public class SingleTracker {
    private Tracker tracker = new Tracker();

    private static ru.job4j.tracker.SingleTracker instance = null;

    private SingleTracker() {
    }

    public static ru.job4j.tracker.SingleTracker getInstance() {
        if (instance == null) {
            instance = new ru.job4j.tracker.SingleTracker();
        }
        return instance;
    }

    public Item add(Item item) {
        return tracker.add(item);
    }

    public Item findById(int id) {
        return tracker.findById(id);
    }

    public Item[] findAll() {
        return tracker.findAll();
    }

    public Item[] findByName(String key) {
        return tracker.findByName(key);
    }

    public boolean replace(int id, Item item) {
        return tracker.replace(id, item);
    }

    public boolean delete(int id) {
        return tracker.delete(id);
    }
}
