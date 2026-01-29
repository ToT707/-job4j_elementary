package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

class MaxTest {

    @Test
    void when378ThenMaxThreeMustBe8() {
        int expected = 8;
        int output = Max.maxThree(3, 7, 8);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void when5973ThenMaxFourMustBe9() {
        int expected = 9;
        int output = Max.maxFour(5, 9, 7, 3);
        assertThat(output).isEqualTo(expected);
    }
}