package ru.job4j.loop;

public class NumberPyramid {
    public static void draw(int height) {
        for (int i = 1; i <= height; i++) {
            for (int spaces = i; spaces < height; spaces++) {
                System.out.print(" ");
            }
            for (int directOrder = 1; directOrder <= i; directOrder++) {
                System.out.print(directOrder);
            }
            for (int reverseOrder = i - 1; reverseOrder > 0; reverseOrder--) {
                System.out.print(reverseOrder);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
       draw(9);
    }
}
