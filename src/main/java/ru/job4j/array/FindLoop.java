package ru.job4j.array;

public class FindLoop {
    public static int indexOf(int[] data, int element) {
        int res = -1;
        for (int i = 0; i < data.length; i++) {
            if (data[i] == element) {
                res = i;
                break;
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[] data = {1, 8, 14, 5, 3};
        System.out.println(indexOf(data, 5));
    }
}
