package ru.job4j.array;

public class TwoNumberSum {
    public static int[] getIndexes(int[] array, int target) {
        int[] result = new int[0];
        int i = 0;
        int j = array.length - 1;
        while (i < j) {
            if (array[i] + array[j] == target) {
                result = new int[]{i, j};
                break;
            }
            if (array[i] + array[j] > target) {
                j--;
            }
            if (array[i] + array[j] < target) {
                i++;
            }
        }
        return result;
    }
}
