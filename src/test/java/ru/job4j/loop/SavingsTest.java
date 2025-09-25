package ru.job4j.loop;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

class SavingsTest {
    @Test
    void whenGoal5000Deposit250Percent7ThenYears13() {
        double goal = 5000;
        double annualDeposit = 250;
        double percent = 7;
        int result = Savings.years(goal, annualDeposit, percent);
        int expected = 13;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenGoal10000Deposit500Percent17ThenYears10() {
        double goal = 10000;
        double annualDeposit = 500;
        double percent = 17;
        int result = Savings.years(goal, annualDeposit, percent);
        int expected = 10;
        assertThat(result).isEqualTo(expected);
    }

    @Test
    void whenGoal20000Deposit1000Percent3ThenYears16() {
        double goal = 20_000;
        double annualDeposit = 1000;
        double percent = 3;
        int result = Savings.years(goal, annualDeposit, percent);
        int expected = 16;
        assertThat(result).isEqualTo(expected);
    }

}