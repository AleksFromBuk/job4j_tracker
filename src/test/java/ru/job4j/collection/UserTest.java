package ru.job4j.collection;

import org.junit.Test;

import java.util.Collections;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

import static org.hamcrest.core.Is.is;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.*;

public class UserTest {
    @Test
    public void whenAsc() {
        Set<User> users = new TreeSet<>();
        users.add(new User("Petr", 32));
        users.add(new User("Ivan", 31));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("Ivan", 31)));
        assertThat(it.next(), is(new User("Petr", 32)));
    }

    @Test
    public void whenComparePetrVSIvan() {
        int rsl = new User("Petr", 32).compareTo(new User("Ivan", 31));
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenFirstLessThanSecond() {
        Set<User> users = new TreeSet<>();
        users.add(new User("qwerty", 37));
        users.add(new User("qwert", 37));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("qwert", 37)));
    }

    @Test
    public void whenCompareByNames() {
        Set<User> users = new TreeSet<>();
        users.add(new User("qwerty", 37));
        users.add(new User("qwerty", 33));
        Iterator<User> it = users.iterator();
        assertThat(it.next(), is(new User("qwerty", 33)));
        assertThat(it.next(), is(new User("qwerty", 37)));

    }
}
