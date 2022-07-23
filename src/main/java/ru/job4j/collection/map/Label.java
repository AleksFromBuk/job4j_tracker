package ru.job4j.collection.map;

import java.util.Objects;

public final class Label implements Comparable<Label> {
    private final String name;
    private final double score;

    Label(String name, double score) {
        this.name = name;
        this.score = score;
    }

    public String name() {
        return name;
    }

    public double score() {
        return score;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || obj.getClass() != this.getClass()) {
            return false;
        }
        Label that = (Label) obj;
        return Objects.equals(this.name, that.name)
                &&
                Double.doubleToLongBits(this.score) == Double.doubleToLongBits(that.score);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, score);
    }

    @Override
    public String toString() {
        return "Label[" + "name=" + name + ", " +  "score=" + score + ']';
    }

    @Override
    public int compareTo(Label o) {
        return Double.compare(this.score, o.score);
    }
}

