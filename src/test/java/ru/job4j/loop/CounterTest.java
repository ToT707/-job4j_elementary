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

    @Test
    void whenStart0AndFinish5ThenSumEvenMustBe6() {
        int start = 0;
        int finish = 5;
        int expected = 6;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart5AndFinish10ThenSumEvenMustBe24() {
        int start = 5;
        int finish = 10;
        int expected = 24;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart2AndFinish9ThenSumEvenMustBe20() {
        int start = 2;
        int finish = 9;
        int expected = 20;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStart5AndFinish2ThenSumEvenMustBe0() {
        int start = 5;
        int finish = 2;
        int expected = 0;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }

    @Test
    void whenStartMinus7AndFinish10ThenSumEvenMustBe18() {
        int start = -7;
        int finish = 10;
        int expected = 18;
        int output = Counter.sumByEven(start, finish);
        assertThat(output).isEqualTo(expected);
    }
}