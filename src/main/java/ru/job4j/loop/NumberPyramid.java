package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int n) {
        for (int i = 1; i <= n; i++) {
            for (int p = i; p < n; p++) {
                System.out.print(" ");
            }
            for (int pp = 1; pp <= i; pp++) {
                System.out.print(pp);
            }
            for (int ob = i - 1; ob > 0; ob--) {
                System.out.print(ob);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       draw(9);
    }
}
