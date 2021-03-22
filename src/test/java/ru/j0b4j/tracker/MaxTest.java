package ru.j0b4j.tracker;

import org.junit.Assert;
import org.junit.Test;
//import static org.junit.Assert;

public class MaxTest {

    @Test
    public void max() {
        int expected = 5;
        int out = Max.max(1, 5);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void testMax() {
        int expected  = 3;
        int out = Max.max(1, 2, 3);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void testMax1() {
        int expected = 7;
        int out = Max.max(1, 3, 5, 7);
        Assert.assertEquals(out, expected);
    }
}