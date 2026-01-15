package ru.job4j.loop;

public class Frame {
    public static void draw(int size) {
        for (int row = 0; row < size; row++) {
            for (int column = 0; column < size; column++) {
                boolean isTopOrBottomBorder = row == 0 || row == size - 1;
                boolean isSideBorder = column == 0 || column == size - 1;
                if (isTopOrBottomBorder && isSideBorder) {
                    System.out.print("+");
                } else if (isTopOrBottomBorder) {
                    System.out.print("-");
                } else if (isSideBorder) {
                    System.out.print("|");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        draw(10);
    }
}
