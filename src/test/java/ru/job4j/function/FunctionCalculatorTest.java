package ru.job4j.function;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class FunctionCalculatorTest {
    @Test
    public void whenLinearFunctionThenLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(5, 8, x -> 2 * x + 1);
        List<Double> expected = Arrays.asList(11D, 13D, 15D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenSquareFunctionThenNONLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(-3, 4, x ->  (x - 3) * (x +  3));
        List<Double> expected = Arrays.asList(0D, -5D, -8D, -9D, -8D, -5D, 0D);
        assertThat(result).containsAll(expected);
    }

    @Test
    public void whenExponentialFunctionThenNONLinearResults() {
        FunctionCalculator function = new FunctionCalculator();
        List<Double> result = function.diapason(-1, 4, x -> Math.pow(2, x));
        List<Double> expected = Arrays.asList(0.5D, 1D, 2D, 4D, 8D);
        assertThat(result).containsAll(expected);
    }
}