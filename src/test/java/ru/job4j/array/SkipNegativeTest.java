package ru.job4j.array;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class SkipNegativeTest {
    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {{1, -2}, {1, 2}};
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {{1, 0}, {1, 2}};
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenThreeNegativeNumbers() {
        int[][] array = {{-1, 2, 6, -7}, {-1, 2}};
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {{0, 2, 6, 0}, {0, 2}};
        assertThat(result).isDeepEqualTo(expected);
    }

    @Test
    public void whenArrayAllNegativeNumbers() {
        int[][] array = {{-1, -2}, {-5, -8}};
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {{0, 0}, {0, 0}};
        assertThat(result).isDeepEqualTo(expected);
    }
}