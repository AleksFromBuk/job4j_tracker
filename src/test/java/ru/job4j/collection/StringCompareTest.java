package ru.job4j.collection;

import org.junit.Test;
import java.util.Arrays;

import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class StringCompareTest {
    @Test
    public void whenStringsAreEqualThenZero () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanov"
        );
        assertThat(rst, is(0));
    }

    @Test
    public void whenLeftLessThanRightResultShouldBeNegative () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Ivanov",
                "Ivanova"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void whenLeftGreaterThanRightResultShouldBePositive () {
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Ivanova"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftGreaterThanRightShouldBePositive(){
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Petrov",
                "Patrov"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void secondCharOfLeftLessThanRightShouldBeNegative(){
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "Patrova",
                "Petrov"
        );
        assertThat(rst, lessThan(0));
    }

    @Test
    public void addTest1(){
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "123",
                "10"
        );
        assertThat(rst, greaterThan(0));
    }

    @Test
    public void addTest2(){
        StringCompare compare = new StringCompare();
        int rst = compare.compare(
                "7",
                "10"
        );
        assertThat(rst, greaterThan(0));
    }
    //    @Test
//    public void sortNum1and2and10() {
//        String[] input = {
//                "10. Task.",
//                "1. Task.",
//                "2. Task."
//        };
//        String[] out = {
//                "1. Task.",
//                "2. Task.",
//                "10. Task."
//        };
//        Arrays.sort(input, new StringCompare());
//        assertThat(input, is(out));
//    }
}