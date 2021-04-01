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