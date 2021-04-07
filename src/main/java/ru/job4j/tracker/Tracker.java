package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[5];
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
        int index = indexOf(id);
        return index != -1 ? items[index] : null;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        int newSize = 0;
        Item[] rsl = new Item[size];
        for(int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                rsl[newSize++] = items[i];
            }
        }
        return Arrays.copyOf(rsl, newSize);
    }
// ctrl + /
//this.findById(id) .setName(item.getName());

    public boolean replace(int id, Item item) {
        boolean rsl = false;
        int index = indexOf(id);
        if (index != -1) {
            item.setId(id);
            items[index] = item;
            rsl = true;
        }
        return rsl;
    }

    public boolean delete(int id) {
//        int index = indexOf(id);
//        if(index != -1) {
//            items[index] = null;
//            if(index == items.length - 1) {
//                size--;
//                return true;
//            } else {
//                System.arraycopy(items, index, items, index + 1, size - index);
//                items[size] = null;
//                size--;
//                return true;
//            }
//        } else {
//            return false;
//        }
        int index = indexOf(id);
        if (index != - 1) {
            items[index] = null;
            System.arraycopy(items, index + 1, items, index, size - index);
            size--;
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        for (int i = 1; i <= 5; i++) {
            Item bug = new Item();
            bug.setName("Bug");
            tracker.add(bug);
        }
        Item[] valid = tracker.findByName("Bug");
        for ( Item ob : valid) {
            System.out.println(ob.getName() + '\t' + ob.getId());
        }
        System.out.println();
        if(tracker.delete(5)) {
            for ( Item ob : valid) {
                System.out.println(ob.getName() + '\t' + ob.getId());

            }
        }
        else {
            System.out.println("Error...");
        }
    }
}