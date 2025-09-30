package ru.job4j.array;

public class Square {
    public static double[] calculate(int bound) {
        double[] res = new double[bound];
        for (int i = 0; i < res.length; i++) {
            res[i] = Math.pow(i, 2);
        }
        return res;
    }

    public static void main(String[] args) {
        for (double n : calculate(4)) {
            System.out.println(n);
        }
    }
}
