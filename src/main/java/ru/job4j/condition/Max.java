package ru.job4j.condition;

public class Max {

    public static int maxThree(int a, int b, int c) {
        return (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
    }

    public static int maxFour(int a, int b, int c, int d) {
        return (maxThree(a, b, c) > d) ? maxThree(a, b, c) : d;
    }
}
