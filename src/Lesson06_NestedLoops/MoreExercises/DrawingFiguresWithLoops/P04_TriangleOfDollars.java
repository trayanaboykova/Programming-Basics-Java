package Lesson06_NestedLoops.MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P04_TriangleOfDollars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int row = 1; row <= n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
    }
}
