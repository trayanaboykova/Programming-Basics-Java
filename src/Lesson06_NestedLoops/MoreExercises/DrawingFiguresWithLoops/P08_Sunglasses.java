package Lesson06_NestedLoops.MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P08_Sunglasses {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String stars = repeatSymbol("*", n * 2);
        String spaces = repeatSymbol(" ", n);
        String slashes = repeatSymbol("/", n * 2 - 2);

        System.out.println(stars + spaces + stars);

        for (int i = 0; i < n - 2; i++) {
            if (i == (n - 1) / 2 - 1) {
                System.out.println("*" + slashes + "*" + repeatSymbol("|", n) + "*" + slashes + "*");
            } else {
                System.out.println("*" + slashes + "*" + spaces + "*" + slashes + "*");
            }
        }

        System.out.println(stars + spaces + stars);
    }

    public static String repeatSymbol(String symbol, int count) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < count; i++) {
            sb.append(symbol);
        }
        return sb.toString();
    }
}
