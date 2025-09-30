package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SquareTest {
    @Test
    void whenBound3Then014() {
        int bound = 3;
        int[] res = Square.calculate(bound);
        int[] expected = {0, 1, 4};
        assertThat(res).containsExactly(expected);
    }

    @Test
    void whenBound5Then014916() {
        int bound = 5;
        int[] res = Square.calculate(bound);
        int[] expected = {0, 1, 4, 9, 16};
        assertThat(res).containsExactly(expected);
    }
}