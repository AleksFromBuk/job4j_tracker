package ru.job4j.collection;

import org.junit.Test;
import org.junit.Ignore;

import java.util.Arrays;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

   @Ignore
    public class ConvertList2ArrayTest {
        @Test
        public void when7ElementsThen9() {
            ConvertList2Array list = new ConvertList2Array();
            int[][] result = list.toArray(
                    Arrays.asList(1, 2, 3, 4, 5, 6, 7),
                    3
            );
            int[][] expect = {
                    {1, 2, 3},
                    {4, 5, 6},
                    {7, 0, 0}
            };
            assertThat(result, is(expect));
        }

       @Test
       public void when7ElementsThen25() {
           ConvertList2Array list = new ConvertList2Array();
           int[][] result = list.toArray(
                   Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17,
                           18, 19, 20, 21),
                   4);

           int[][] expect = {
                   {1, 2, 3, 4},
                   {5, 6, 7, 8},
                   {9, 10, 11, 12},
                   {13, 14, 15, 16},
                   {17, 18, 19, 20},
                   {21, 0, 0, 0}
           };
           assertThat(result, is(expect));
       }
}