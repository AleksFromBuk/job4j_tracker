package ru.job4j.oop;

public class Plane implements  Vehicle {

    @Override
    public void move() {
        System.out.println("- метод объекта \"Plane\" ");
    }

    @Override
    public void identyObj() {
        System.out.println("Средняя скорость полета 210-800 километров в час");
    }
}
