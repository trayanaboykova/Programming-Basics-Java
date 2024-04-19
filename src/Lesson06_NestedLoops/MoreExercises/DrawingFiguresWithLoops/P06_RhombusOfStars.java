package Lesson06_NestedLoops.MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P06_RhombusOfStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int stars = 1; stars < row; stars++) {
                System.out.print(" *");
            }
            System.out.println();
        }

        for (int row = n - 1; row >= 1; row--) {
            for (int spaces = 1; spaces <= n - row; spaces++) {
                System.out.print(" ");
            }
            System.out.print("*");
            for (int stars = 1; stars < row; stars++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
