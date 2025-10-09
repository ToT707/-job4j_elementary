package ru.job4j.array;

public class SortSelected {
    public static int[] sort(int[] data) {
        for (int i = 0; i < data.length; i++) {
            int min = MinDiapason.findMin(data, i, data.length - 1);
            int index = FindLoop.indexInRange(data, min, i, data.length - 1);
            SwitchArray.swap(data, i, index);
          /*  Но пока я не подсмотрел в каркас был такой вариант :
            data = SwitchArray.swap(data, i, FindLoop.indexInRange(data, MinDiapason.findMin(data, i, data.length - 1), i, data.length - 1)); */
        }
        return data;
    }
}
