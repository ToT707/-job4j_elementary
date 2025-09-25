package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class PrimeNumberTest {
    @Test
    void whenFinish5ThenCountMustBe3() {
        int input = 5;
        int output = PrimeNumber.calc(input);
        int expected = 3;
        assertThat(expected).isEqualTo(output);
    }

    @Test
    void whenFinish568ThenCountMustBe103() {
        int input = 568;
        int output = PrimeNumber.calc(input);
        int expected = 103;
        assertThat(expected).isEqualTo(output);
    }

    @Test
    void whenFinish0ThenCountMustBe0() {
        int input = 0;
        int output = PrimeNumber.calc(input);
        int expected = 0;
        assertThat(expected).isEqualTo(output);
    }

    @Test
    void whenFinish1ThenCountMustBe0() {
        int input = 1;
        int output = PrimeNumber.calc(input);
        int expected = 0;
        assertThat(expected).isEqualTo(output);
    }
}