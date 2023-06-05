package ru.job4j.collection;

import java.util.HashMap;
import java.util.Map;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("mr.anton@yandexru", "Lopatin Anton Antonovich");
        map.put("mr.anton@yandexru", "Lopatin Anton Antonovich");
        map.put("mr.maksim@yandexru", "Lopatin Anton Maksimovich");
        map.put("mr.victor@yandexru", "Lopatin Anton Victorovich");
        for (Map.Entry<String, String> entry : map.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key + " - " + value);
        }
    }
}
