package ru.job4j.collection;

import java.util.*;

import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void compareByIdLagger() {
        List<Item> obj = Arrays.asList(
                new Item(3,"Test1"),
                new Item(2,"Test2"),
                new Item(1,"Test3")
        );
        List<Item> expected = Arrays.asList(
                new Item(1,"Test3"),
                new Item(2,"Test2"),
                new Item(3,"Test1")
        );
        Collections.sort(obj);
        assertThat(obj, is(expected));
    }

    @Test
    public void compareByNameLagger() {
        List<Item> obj = Arrays.asList(
                new Item(3,"Test1"),
                new Item(2,"Test2"),
                new Item(1,"Test3")
        );
        List<Item> expected = Arrays.asList(
                new Item(3,"Test1"),
                new Item(2,"Test2"),
                new Item(1,"Test3")
        );
        Collections.sort(obj, new SortByNameItem());
        assertThat(obj, is(expected));
    }

    @Test
    public void compareByIdLess() {
        List<Item> obj = Arrays.asList(
                new Item(1,"Test1"),
                new Item(2,"Test2"),
                new Item(3,"Test3")
        );
        List<Item> expected = Arrays.asList(
                new Item(3,"Test3"),
                new Item(2,"Test2"),
                new Item(1,"Test1")
        );
        Collections.sort(obj, Collections.reverseOrder());
        assertThat(obj, is(expected));
    }

    @Test
    public void compareByNameLess() {
        List<Item> obj = Arrays.asList(
                new Item(1,"Test1"),
                new Item(2,"Test2"),
                new Item(3,"Test3")
        );
        List<Item> expected = Arrays.asList(
                new Item(3,"Test3"),
                new Item(2,"Test2"),
                new Item(1,"Test1")
        );
        Collections.sort(obj, new SortByNameItem());
        Collections.sort(obj, Collections.reverseOrder());
        assertThat(obj, is(expected));
    }
}