package ru.job4j.tracker;

public class Engineer extends Profession {

    private String name;
    private int level;
    private float cost;

    public Engineer() {

    }

    public Engineer(String name, int value1, float value2 ) {
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

    public boolean mayNotMay(People mrG) {
        boolean rsl = false;
        //............
        return rsl;
    }

}
