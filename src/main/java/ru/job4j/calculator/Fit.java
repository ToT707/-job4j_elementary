package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        // Formula for man's weight: (height in cm - 100) * 1.15
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        // Formula for woman's weight: (height in cm - 110) * 1.15
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short manHeight = 177;
        double man = Fit.manWeight(manHeight);
        System.out.println("Man 177 cm is " + man + " kg");
        short womanHeight = 167;
        double woman = Fit.womanWeight(womanHeight);
        System.out.println("Woman 167 cm is " + woman + " kg");
    }
}
