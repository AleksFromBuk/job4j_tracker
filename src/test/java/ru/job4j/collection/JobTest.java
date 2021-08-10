package ru.job4j.collection;

import org.junit.Test;
import java.util.Comparator;
import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;
import static org.junit.Assert.assertThat;

import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenCompatorDescByName() {
        Comparator<Job> cmpDescName = new JobDescByName();
        int rsl = cmpDescName.compare(
                new Job("AB", 0),
                new Job("AA", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscByName() {
        Comparator<Job> cmpAscName = new JobAscByName();
        int rsl = cmpAscName.compare(
                new Job("AB", 1),
                new Job("AA", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByPriority() {
        Comparator<Job> cmpDescPriority = new JobDescByPriority();
        int rsl = cmpDescPriority.compare(
                new Job("AB", 1),
                new Job("AA", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscByPriority() {
        Comparator<Job> cmpAscPriority = new JobAscByPriority();
        int rsl = cmpAscPriority.compare(
                new Job("AA", 1),
                new Job("AA", 2)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorDescByNameAndPrority() {
    Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
    int rsl = cmpNamePriority.compare(
            new Job("Impl task", 0),
            new Job("Fix bug", 1)
    );
    assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenCompatorAscByNameAndDescPrority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 1),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAscByNameAndAscPrority() {
        Comparator<Job> cmpNamePriority = new JobAscByName().thenComparing(new JobAscByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("qwerty", 0),
                new Job("qwerty", -1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByProrityAndDescNameFirstTest() {
        Comparator<Job> cmpPriorityName =
                new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorDescByProrityAndDescNameSecondTest() {
        Comparator<Job> cmpPriorityName =
                new JobDescByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(
                new Job("qwert", 0),
                new Job("qwerty", 0)
        );
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void whenCompatorAcsByNameAndDescProrityThirdTest() {
        Comparator<Job> cmpNamePriority =
                new JobAscByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("qwerty", -1),
                new Job("qwerty", -2)
        );
        assertThat(rsl, lessThan(0));
    }
}