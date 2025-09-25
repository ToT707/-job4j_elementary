package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class CheckPrimeNumberTest {
    @Test
    void whenNumber7ThenTrue() {
        int number = 7;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void whenNumber13ThenTrue() {
        int number = 13;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isTrue();
    }

    @Test
    void whenNumber0ThenFalse() {
        int number = 0;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumber1ThenFalse() {
        int number = 1;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }

    @Test
    void whenNumber27ThenFalse() {
        int number = 27;
        boolean result = CheckPrimeNumber.check(number);
        assertThat(result).isFalse();
    }
}