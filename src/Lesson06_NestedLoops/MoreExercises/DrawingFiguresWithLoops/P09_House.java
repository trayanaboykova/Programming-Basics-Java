package Lesson06_NestedLoops.MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P09_House {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int starsCount = (n % 2 == 0) ? 2 : 1;

        for (int i = 0; i < (n + 1) / 2; i++) {
            String stars = repeatString("*", starsCount);
            String dashes = repeatString("-", (n - starsCount) / 2);
            System.out.println(dashes + stars + dashes);
            starsCount += 2;
        }

        String baseRows = repeatString("|" + repeatString("*", n - 2) + "|\n", n / 2);
        System.out.print(baseRows);
    }

    public static String repeatString(String toRepeat, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(toRepeat);
        }
        return result.toString();
    }
}
