package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private  int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public double distance(Point another) {
        return sqrt(pow(this.x - another.x, 2) +  pow(this.y - another.y, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(5,5);
        Point b = new Point(2,1);
        System.out.println(a.distance(b));
    }
}
