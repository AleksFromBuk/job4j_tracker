package ru.job4j.oop;

import static java.lang.Math.sqrt;
import static java.lang.Math.pow;

public class Point {
    private int x;
    private  int y;
    private int z;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Point(int x, int y, int z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double distance(Point another) {
        return sqrt(pow(this.x - another.x, 2) +  pow(this.y - another.y, 2));
    }

    public double distance3d(Point that) {
        return sqrt(pow(this.x - that.x, 2) +  pow(this.y - that.y, 2) + pow(this.z - that.z, 2));
    }

    public static void main(String[] args) {
        Point a = new Point(5,5);
        Point b = new Point(2,1);
        System.out.println(a.distance(b));
        Point aD = new Point(9,7,0);
        Point bD = new Point(1,1,0);
        System.out.println(aD.distance3d(bD));
    }
}
