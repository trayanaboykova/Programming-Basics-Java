package Lesson07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P02_FootballResults {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int wins = 0;
        int losses = 0;
        int draws = 0;

        for (int i = 0; i < 3; i++) {
            String result = scanner.nextLine();
            String[] parts = result.split(":");
            int homeGoals = Integer.parseInt(parts[0]);
            int awayGoals = Integer.parseInt(parts[1]);

            if (homeGoals > awayGoals) {
                wins++;
            } else if (homeGoals < awayGoals) {
                losses++;
            } else {
                draws++;
            }
        }

        System.out.println("Team won " + wins + " games.");
        System.out.println("Team lost " + losses + " games.");
        System.out.println("Drawn games: " + draws);
    }
}
