package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class FitnessTest {
    @Test
    void whenIvanFiftyAndNikEightyThenMonthMustBeTwo() {
        int ivan = 50;
        int nik = 80;
        int result = Fitness.calc(ivan, nik);
        int expected = 2;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanFiftyAndNikSeventyThenMonthMustBeOne() {
        int ivan = 50;
        int nik = 70;
        int result = Fitness.calc(ivan, nik);
        int expected = 1;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanTenAndNikEightyThenMonthMustBeSix() {
        int ivan = 10;
        int nik = 80;
        int result = Fitness.calc(ivan, nik);
        int expected = 6;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenIvanNinetyAndNikEightyThenMonthMustBeZero() {
        int ivan = 90;
        int nik = 80;
        int result = Fitness.calc(ivan, nik);
        int expected = 0;
        assertThat(result).isEqualTo(expected);
    }
}