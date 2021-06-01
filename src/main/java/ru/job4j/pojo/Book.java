package ru.job4j.pojo;

public class Book {
    private String name;
    private int numberOfPages;

    public Book(String name, int cnt) {
       this.name = name;
       this.numberOfPages = cnt;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return numberOfPages;
    }

    public void setCount(int count) {
        this.numberOfPages = count;
    }
}
