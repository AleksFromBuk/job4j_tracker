package ru.job4j.tracker;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.List;

public class Tracker {
    private final List<Item> items = new ArrayList<>();
    private int ids = 1;

    public Item add(Item item) {
        item.setId(ids++);
        items.add(item);
        return item;
    }

    public boolean delete(int id) {
        int index = indexOf(id);
        boolean result = index != -1;
        if(result) {
            items.remove(index);
        }
        return result;
    }

    private int indexOf(int id) {
        int rsl = -1;
        for(int index = 0; index < items.size(); index++) {
            if(items.get(index).getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public Item findById(int id) {
        int index = indexOf(id);
        return index != - 1 ? items.get(index) : null;
    }

    public List<Item> findAll() {
        return List.copyOf(items);
    }

    public List<Item> findByName(String key) {

        List<Item> rsl = new ArrayList<>();
        for (Item it : items) {
           if (it.getName().equals(key)) {
               rsl.add(it);
           }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int index = indexOf(id);
        boolean result = index != -1;
        if (result) {
            item.setId(id);
            items.add(index, item);
            items.remove(index + 1);
        }
        return result;
    }
}