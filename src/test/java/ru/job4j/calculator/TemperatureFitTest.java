package ru.job4j.calculator;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;
import static ru.job4j.calculator.TemperatureFit.*;

class TemperatureFitTest {

    @Test
    void whenTemperature10ThenFruits8() {
        int input = 10;
        double expected = 8.0;
        double output = idealTemperatureForFruits(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenTemperature10ThenMeat5() {
        int input = 10;
        double expected = 5.0;
        double output = idealTemperatureForMeat(input);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}