package Exams.MoreExams.E01;

import java.util.Scanner;

public class P06_BasketballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalMatches = 0;
        int wins = 0;
        int losses = 0;

        String input = scanner.nextLine();

        while (!input.equals("End of tournaments")) {
            String tournamentName = input;
            int matches = Integer.parseInt(scanner.nextLine());

            for (int i = 1; i <= matches; i++) {
                int desiPoints = Integer.parseInt(scanner.nextLine());
                int opponentPoints = Integer.parseInt(scanner.nextLine());

                int difference = Math.abs(desiPoints - opponentPoints);

                if (desiPoints > opponentPoints) {
                    System.out.printf("Game %d of tournament %s: win with %d points.%n", i, tournamentName, difference);
                    wins++;
                } else {
                    System.out.printf("Game %d of tournament %s: lost with %d points.%n", i, tournamentName, difference);
                    losses++;
                }

                totalMatches++;
            }

            input = scanner.nextLine();
        }

        double winPercentage = (double) wins / totalMatches * 100;
        double lossPercentage = (double) losses / totalMatches * 100;

        System.out.printf("%.2f%% matches win%n", winPercentage);
        System.out.printf("%.2f%% matches lost%n", lossPercentage);
    }
}
