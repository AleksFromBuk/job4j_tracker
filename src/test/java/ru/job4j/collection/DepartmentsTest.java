package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class DepartmentsTest {

    @Test
    public void whenMissed() {
        List<String> input = Arrays.asList("k1/sk1");
        List<String> expected = List.of("k1", "k1/sk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenMoreMissed() {
        List<String> input = Arrays.asList("k1/sk1/ssk1");
        List<String> expected = List.of("k1", "k1/sk1", "k1/sk1/ssk1");
        List<String> result = Departments.fillGaps(input);
        assertThat(result, is(expected));
    }

    @Test
    public void whenNonChange() {
        List<String> input = Arrays.asList("k1", "k1/sk1");
        List<String> expected = List.of("k1", "k1/sk1");
        List<String> rsl = Departments.fillGaps(input);
        assertThat(rsl, is(expected));
    }

    @Test
    public void naturalOrderSortWithFillGaps() {
        List<String> input = Departments.fillGaps(Arrays.asList("K2/SK1/SSK1", "K2/SK1/SSK2",
                "K2/SK2", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2"));
        List<String> expected = List.of("K1", "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2",
                "K1/SK2", "K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2", "K2/SK2");
        Departments.sortAsc(input);
        assertThat(expected, is(input));
    }

    @Test
    public void descOrderSortWithFillGaps() {
        List<String> input = Departments.fillGaps(Arrays.asList("K1/SK1", "K1/SK2", "K1/SK1/SSK1",
                "K1/SK1/SSK2", "K2", "K2/SK1/SSK1", "K2/SK1/SSK2"));

        List<String> expected = List.of("K2", "K2/SK1", "K2/SK1/SSK1", "K2/SK1/SSK2", "K1",
                "K1/SK1", "K1/SK1/SSK1", "K1/SK1/SSK2", "K1/SK2");

        Departments.sortDesc(input);
        assertThat(input, is(expected));
    }

}