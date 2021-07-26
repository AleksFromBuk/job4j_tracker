package ru.job4j.search;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class PriorityQueueTest {

    @Test
    public void whenHigherPriority() {
      PriorityQueue queue = new PriorityQueue();
      queue.put(new Task("low", 5));
      queue.put(new Task("urgent", 1));
      queue.put(new Task("middle", 3));
      Task result = queue.take();
      assertThat(result.getDesc(), is("urgent"));
    }

    @Test
    public void whenSizeIsNull() {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 5));
        Task result = queue.take();
        assertThat(result.getDesc(), is("low"));
    }

    @Test
    public void whenTheEndOfQueue () {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 2));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.take();
        queue.take();
        Task result = queue.take();
        assertThat(result.getDesc(), is("middle"));
    }

    @Test
    public void whenInsertBetween () {
        PriorityQueue queue = new PriorityQueue();
        queue.put(new Task("low", 4));
        queue.put(new Task("urgent", 1));
        queue.put(new Task("middle", 3));
        queue.put(new Task("middle", 2));
        queue.take();
        Task result = queue.take();
        assertThat(result.getDesc(), is("middle"));
    }


}