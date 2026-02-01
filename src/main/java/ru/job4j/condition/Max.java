package ru.job4j.condition;

public class Max {

    public  static int maxTwo(int a, int b) {
        return (a > b) ? a : b;
    }

    public static int maxThree(int a, int b, int c) {
        return (maxTwo(a, b) > c) ? maxTwo(a, b) : c;
    }

    public static int maxFour(int a, int b, int c, int d) {
        return (maxTwo(a, b) > maxTwo(c, d)) ? maxTwo(a, b) : maxTwo(c, d));
    }
}
