package ru.j0b4j.tracker;

import junit.framework.Assert;
import org.junit.jupiter.api.Test;

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
}