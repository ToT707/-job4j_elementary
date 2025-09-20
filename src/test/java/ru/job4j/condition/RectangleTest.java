package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class RectangleTest {

    @Test
    void whenLength3AndWidth5ThenDiagonal5dot83() {
        double length = 3, width = 5, expected = 5.83;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength8AndWidth2ThenDiagonal8dot24() {
        double length = 8, width = 2, expected = 8.24;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenLength15AndWidth24ThenDiagonal28dot3() {
        double length = 15, width = 24, expected = 28.3;
        double output = Rectangle.diagonal(length, width);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}