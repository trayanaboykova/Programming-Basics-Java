package Lesson04_ForLoop.MoreExercises;

import java.util.Scanner;

public class P05_GameOfIntervals {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfMoves = Integer.parseInt(scanner.nextLine());

        double score = 0;
        int[] counts = new int[6];

        for (int i = 0; i < numberOfMoves; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number < 0 || number > 50) {
                score /= 2;
                counts[5]++;
            } else if (number >= 0 && number <= 9) {
                score += number * 0.20;
                counts[0]++;
            } else if (number >= 10 && number <= 19) {
                score += number * 0.30;
                counts[1]++;
            } else if (number >= 20 && number <= 29) {
                score += number * 0.40;
                counts[2]++;
            } else if (number >= 30 && number <= 39) {
                score += 50;
                counts[3]++;
            } else if (number >= 40 && number <= 50) {
                // From 40 to 50
                score += 100;
                counts[4]++;
            }
        }

        System.out.printf("%.2f\n", score);
        System.out.printf("From 0 to 9: %.2f%%\n", 100.0 * counts[0] / numberOfMoves);
        System.out.printf("From 10 to 19: %.2f%%\n", 100.0 * counts[1] / numberOfMoves);
        System.out.printf("From 20 to 29: %.2f%%\n", 100.0 * counts[2] / numberOfMoves);
        System.out.printf("From 30 to 39: %.2f%%\n", 100.0 * counts[3] / numberOfMoves);
        System.out.printf("From 40 to 50: %.2f%%\n", 100.0 * counts[4] / numberOfMoves);
        System.out.printf("Invalid numbers: %.2f%%\n", 100.0 * counts[5] / numberOfMoves);

    }
}
