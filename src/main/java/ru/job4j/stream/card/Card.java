package ru.job4j.stream.card;

import java.util.stream.Stream;

public class Card {
    private Suit suit;
    private Value value;

    public Card(Suit suit, Value value) {
        this.suit = suit;
        this.value = value;
    }

    @Override
    public String toString() {
        return  suit + " " + value;
    }

    public static void main(String[] args) {
        Stream.of(Value.values())
                .flatMap(value -> Stream.of(Suit.values())
                        .map(suit -> new Card(suit, value)))
                .forEach(System.out::println);
    }
}