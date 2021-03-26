package ru.job4j.tracker;

public class Builder {

    private String name;
    private int level;
    private float cost;

    public Builder() {
        this.name = null;
        this.level = -1;
        this.cost = -1F;
    }

    public Builder(String name, int value1, float value2 ) {
        this.name = name;
        this.level = value1;
        this.cost = value2;
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
