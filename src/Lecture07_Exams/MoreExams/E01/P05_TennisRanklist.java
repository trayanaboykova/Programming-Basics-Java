package Lecture07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P05_TennisRanklist {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int tournaments = Integer.parseInt(scanner.nextLine());
        int initialPoints = Integer.parseInt(scanner.nextLine());

        int totalPoints = 0;
        int totalWins = 0;

        for (int i = 0; i < tournaments; i++) {
            String result = scanner.nextLine();

            switch (result) {
                case "W":
                    totalPoints += 2000;
                    totalWins++;
                    break;
                case "F":
                    totalPoints += 1200;
                    break;
                case "SF":
                    totalPoints += 720;
                    break;
            }
        }

        double averagePoints = Math.floor((double) totalPoints / tournaments);
        double winPercentage = (double) totalWins / tournaments * 100;

        System.out.printf("Final points: %d%n", totalPoints + initialPoints);
        System.out.printf("Average points: %.0f%n", averagePoints);
        System.out.printf("%.2f%%", winPercentage);
    }
}
