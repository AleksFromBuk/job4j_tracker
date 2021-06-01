package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    private int indexOf(int id) {
        int rsl = -1;
        for(int index = 0; index < size; index++) {
            if(items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }


//    public Item findById(int id) {
//        Item rsl = null;
//        for (int index = 0; index < size; index++) {
//            Item item = items[index];
//            if (item.getId() == id) {
//                rsl = item;
//                break;
//            }
//        }
//        return rsl;
//    }
    public Item findById(int id) {
        int index = indexOf(id);
        return index != - 1 ? items[index] : null;
    }

//    public Item[] findAll() {
//        int newSize = 0;
//        Item[] rsl = new Item[size];
//        for(int i = 0; i < size; i++) {
//            if (items[i] != null) {
//                rsl[newSize++] = items[i];
//            }
//        }
//        rsl = Arrays.copyOf(rsl, newSize);
//        return rsl;
//    }
    public Item[] findAll() {
        return Arrays.copyOf(items, size);
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

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items[index] = item;
        }
        return result;
    }
}