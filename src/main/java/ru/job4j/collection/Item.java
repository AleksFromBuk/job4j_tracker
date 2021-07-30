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

    public Item(int i, String filed_name) {
        this.id = i;
        this.name = filed_name;
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
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return id == item.id && Objects.equals(name, item.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Item{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Item another) {

        return Integer.compare(id, another.id);
    }

//    public static void main(String args[]) {
//        List<Item> obj = Arrays.asList(
//                new Item(3,"Test1"),
//                new Item(2,"Test2"),
//                new Item(1,"Test3")
//        );
//        System.out.println(obj);
//        Collections.sort(obj);
//        System.out.println(obj);
//        Collections.sort(obj, Collections.reverseOrder());
//        System.out.println(obj);
//    }
}