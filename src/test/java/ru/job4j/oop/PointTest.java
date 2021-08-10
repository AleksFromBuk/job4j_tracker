package ru.job4j.oop;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {
    @Test
    public void when00to20then2() {
        double expected = 10;
        Point a = new Point(10, 2);
        Point b = new Point(2, 8);
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when30to04then5() {
        double expected = 5;
        Point a = new Point(3, 0);
        Point b = new Point(0, 4);
        double out = a.distance(b);
        Assert.assertEquals(expected,  out,  0.01);
    }

    @Test
    public void distance3d() {
        double expected  = 10;
        Point aD = new Point(12,  9,  0);
        Point bD = new Point(4, 3, 0);
        double out = aD.distance3d(bD);
        Assert.assertEquals(expected, out, 0.01);
    }
}