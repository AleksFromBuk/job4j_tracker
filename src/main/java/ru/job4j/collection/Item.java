package ru.job4j.collection;

import java.util.Comparator;
import java.util.Objects;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public  class Item implements Comparable<Item> {
    private int id;
    private String name;

    public Item() {
    }

    public Item(int i, String filedName) {
        this.id = i;
        this.name = filedName;
    }

    public Item(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Item{"
                + "id="
                + id
                + ", name='"
                + name
                + '\''
                + '}';
    }

    @Override
    public int compareTo(Item another) {

        return Integer.compare(id, another.id);
    }
}