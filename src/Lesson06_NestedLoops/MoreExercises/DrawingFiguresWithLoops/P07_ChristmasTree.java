package Lesson06_NestedLoops.MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P07_ChristmasTree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 0; i <= n; i++) {
            String spaces = repeatString(" ", n - i);
            String stars = repeatString("*", i);
            System.out.println(spaces + stars + " | " + stars + spaces);
        }
    }

    public static String repeatString(String toRepeat, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(toRepeat);
        }
        return result.toString();
    }
}
