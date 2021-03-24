package ru.job4j.tracker;

public class Dentist extends Doctor {

    private String name;
    private int level;
    private float cost;

    public Dentist() {

    }

    public Dentist(String name, int value1, float value2 ) {
        this.name = name;
        this.level = value1;
        this.cost = value2;
    }

    public String getName() {
        return this.name;
    }

    public int getSkill() {
        return this.level;
    }

    public float getCost() {
        return this.cost;
    }

}
