package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public int lastUsingIds() {
        if(ids != 1) {
            return ids - 1;
        }
        return ids;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }


    protected Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        int newSize = 0;
        Item[] rsl = new Item[size];
        for(int i = 0; i < size; i++) {
            if (items[i] != null) {
                rsl[newSize++] = items[i];
            }
        }
        rsl = Arrays.copyOf(rsl, newSize);
        return rsl;
    }

    public Item[] findByName(String key) {
        int newSize = 0;
        Item[] rsl = new Item[size];
        for(int i = 0; i < size; i++) {
            if (items[i] != null && key.equals(items[i].getName())) {
                rsl[newSize++] = items[i];
            }
        }
        rsl = Arrays.copyOf(rsl, newSize);
        return rsl;
    }
}