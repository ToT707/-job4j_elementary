package ru.job4j.loop;

public class Fitness {
    public static int calc(int ivan, int nik) {
        int month = 0;
        while (ivan <= nik) {
            month++;
            ivan *= 3;
            nik *= 2;
        } return month;
    }

    public static void main(String[] args) {
        System.out.println(calc(50, 80));
        System.out.println(calc(50, 70));
        System.out.println(calc(10, 80));
        System.out.println(calc(90, 80));
    }
}
