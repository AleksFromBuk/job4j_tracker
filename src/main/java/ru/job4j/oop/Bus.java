package ru.job4j.oop;

public class Bus implements Vehicle {

    public void move() {
        System.out.println("- метод объекта \"Bus\" ");
    }

    @Override
    public void identyObj() {
        System.out.println("Средняя скорость движения в несколько "
                + "в раз меньше средней скорости поездов");
    }
}
