package ru.job4j.tracker;

public class Doctor extends Profession {

    private float cost;
    private int level;

    public Doctor() {
        this.cost  = -1F;
        this.level = -1;
    }

    public Doctor(float cost, int level) {
        this.cost = cost;
        this.level = level;
    }

    public boolean validateIndivids(People candidate) {
        boolean rsl = false;
        /*if (candidate.getName() == "bomjEffect" || candidate.getName() == "legendary Sharikov"
                || candidate.getCurrBalance() < this.cost) {
            return false;
        }
        return true;*/
        return rsl;
    }

}
