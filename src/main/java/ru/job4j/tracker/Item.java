/*
package ru.job4j.tracker;

import java.time.LocalDateTime;

public class Item {
    private int id;
    private String name;
    private LocalDateTime created = LocalDateTime.now();

    public Item() {

    }

    public Item(String str) {
        this.name = str;
    }

    public Item(int first, String second) {
        this.id = first;
        this.name = second;
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

    public LocalDateTime getLDT() {
        return this.created;
    }

    public void setName(String name) {
        this.name = name;
    }
}
*/
package ru.job4j.tracker;

import java.util.Objects;

public class Item {
    private int id;
    private String name;

    public Item() {

    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public Item(int i, String filed_name) {
        this.id = i;
        this.name = filed_name;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}