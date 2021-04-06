package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public int lastUsingIds() {
        return ids == 1 ? 1 : ids - 1;
    }

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }


    public Item findById(int id) {
        /* Находим индекс */
        int index = indexOf(id);
        /* Если индекс найден возвращаем item, иначе null */
        return index != -1 ? items[index] : null;
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

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        if (this.findById(id) != null) {
            item.setId(this.findById(id).getId());
            this.findById(id).setName(item.getName());
            rsl = true;
        }
        return rsl;
    }
}