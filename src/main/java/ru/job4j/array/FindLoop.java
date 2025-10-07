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

    public static int indexInRange(int[] data, int element, int start, int finish) {
        int result = -1;
        for (int i = start; i <= finish; i++) {
            if (data[i] == element) {
                result = i;
                break;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[] data = {1, 8, 14, 5, 3};
        System.out.println(indexOf(data, 5));
    }
}
