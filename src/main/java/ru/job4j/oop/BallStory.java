package ru.job4j.oop;

public class BallStory {

    public static void main(String[] args) {
        Ball kolOne = new Ball();
        Fox foxOne = new Fox();
        Wolf wolfOne = new Wolf();
        Hare hareOne = new Hare();
        kolOne.tryEat(kolOne);
        foxOne.tryEat(kolOne);
        wolfOne.tryEat(kolOne);
        hareOne.tryEat(kolOne);
    }
}
