package Lesson06_NestedLoops.MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P10_Diamond {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int leftRight = (n - 1) / 2;

        for (int i = 0; i < (n + 1) / 2; i++) {
            for (int j = 0; j < leftRight; j++) {
                System.out.print("-");
            }
            System.out.print("*");

            int mid = n - 2 * leftRight - 2;
            if (mid >= 0) {
                for (int j = 0; j < mid; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
            }

            for (int j = 0; j < leftRight; j++) {
                System.out.print("-");
            }

            System.out.println();
            leftRight--;
        }

        leftRight = 1;
        for (int i = (n - 1) / 2 - 1; i >= 0; i--) {
            for (int j = 0; j < leftRight; j++) {
                System.out.print("-");
            }

            System.out.print("*");

            int mid = n - 2 * leftRight - 2;
            if (mid >= 0) {
                for (int j = 0; j < mid; j++) {
                    System.out.print("-");
                }
                System.out.print("*");
            }

            for (int j = 0; j < leftRight; j++) {
                System.out.print("-");
            }

            System.out.println();
            leftRight++;
        }
    }
}
