package Lesson06_NestedLoops.MoreExercises.DrawingFiguresWithLoops;

import java.util.Scanner;

public class P05_SquareFrame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            if (i == 0 || i == n - 1) {
                System.out.print("+");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" -");
                }
                System.out.println(" +");
            } else {
                System.out.print("|");
                for (int j = 0; j < n - 2; j++) {
                    System.out.print(" -");
                }
                System.out.println(" |");
            }
        }
    }
}
