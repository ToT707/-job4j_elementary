package ru.job4j.array;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FindLoopTest {
    @Test
    void whenArraysHas5Then0() {
        int[] data = {5, 10, 8};
        int element = 5;
        int res = FindLoop.indexOf(data, element);
        int expected = 0;
        assertThat(expected).isEqualTo(res);
    }

    @Test
    void whenArraysHasNot5ThenMinus1() {
        int[] data = {7, 10, 8};
        int element = 5;
        int res = FindLoop.indexOf(data, element);
        int expected = -1;
        assertThat(expected).isEqualTo(res);
    }
}