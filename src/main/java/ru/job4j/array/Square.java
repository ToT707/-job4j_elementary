package ru.job4j.array;

public class Square {
    public static int[] calculate(int bound) {
        int[] res = new int[bound];
        for (int i = 0; i < res.length; i++) {
            res[i] = (int) Math.pow(i, 2);
        }
        return res;
    }

    public static void main(String[] args) {
        for (int n : calculate(4)) {
            System.out.println(n);
        }
    }
}
