package ru.job4j.collection;

import java.util.HashMap;
import java.util.List;

public class OrderConvert {
    public static HashMap<String, Order> process(List<Order> orders) {
        HashMap<String, Order> map = new HashMap<>();
        for (Order it: orders) {
            map.put(it.getNumber(), it);
        }
        return map;
    }
}
