package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int currentValue) {
        this.load = currentValue;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery a = new Battery(5);
        Battery b = new Battery(7);
        b.exchange(a);
        System.out.println(b.load);
        System.out.println(a.load);
    }
}
