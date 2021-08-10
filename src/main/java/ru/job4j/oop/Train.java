package ru.job4j.oop;

public class Train implements  Vehicle {

    @Override
    public void move() {
        System.out.println("- метод объекта \"Train\" ");
    }

    @Override
    public void identyObj() {
        System.out.println("Средняя скорость движения — 140 км/ч");
    }
}
