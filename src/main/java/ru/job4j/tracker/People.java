package ru.job4j.tracker;

public  class People {

    private String name;
    private String unusualSkills;
    private float currBalance;

    public People() {
    }

    public People(String name, String magic, float money) {
        this.name = name;
        this.unusualSkills = magic;
        this.currBalance = money;
    }

    public String getName() {
        return this.name;
    }

    public float getCurrBalance() {
        return this.currBalance;
    }
}
