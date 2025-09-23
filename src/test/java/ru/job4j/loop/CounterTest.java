package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CounterTest {

    @Test
    void whenStart0AndFinish5ThenSumMustBe15() {
        int expected = 15;
        int output = Counter.sum(0, 5);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart5AndFinish10ThenSumMustBe45() {
        int expected = 45;
        int output = Counter.sum(5, 10);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart2AndFinish9ThenSumMustBe44() {
        int expected = 44;
        int output = Counter.sum(2, 9);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart5AndFinish2ThenSumMustBe0() {
        int expected = 0;
        int output = Counter.sum(5, 2);
        assertThat(output).isEqualTo(expected);
    }
}