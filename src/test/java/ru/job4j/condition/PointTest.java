package ru.job4j.condition;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.withPrecision;

class PointTest {
    @Test
    void whenPoints12And34Then2dot82() {
        int x1 = 1, y1 = 2, x2 = 3, y2 = 4;
        double expected = 2.82;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPoints58And26Then3dot6() {
        int x1 = 5, y1 = 8, x2 = 2, y2 = 6;
        double expected = 3.6;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }

    @Test
    void whenPointsMinus12And34Then7dot21() {
        int x1 = -1, y1 = -2, x2 = 3, y2 = 4;
        double expected = 7.21;
        double output = Point.distance(x1, y1, x2, y2);
        assertThat(output).isEqualTo(expected, withPrecision(0.01));
    }
}