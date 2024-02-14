package Lecture07_Exams.MoreExams.E06;

import java.util.Scanner;

public class P05_FootballTournament {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String club = scanner.nextLine();
        int numOfMatches = Integer.parseInt(scanner.nextLine());
        int totalPoints = 0, winCount = 0, drawCount = 0, loseCount = 0;

        if (numOfMatches < 1) {
            System.out.printf("%s hasn't played any games during this season.", club);
        } else {
            for (int i = 0; i < numOfMatches; i++) {
                String outcome = scanner.nextLine();

                switch (outcome) {
                    case "W":
                        totalPoints += 3;
                        winCount++;
                        break;
                    case "D":
                        totalPoints += 1;
                        drawCount++;
                        break;
                    case "L":
                        loseCount++;
                        break;
                }
            }

            System.out.printf("%s has won %d points during this season.\nTotal stats:\n" +
                    "## W: %d\n## D: %d\n## L: %d\n" +
                    "Win rate: %.2f%%\n", club, totalPoints, winCount, drawCount, loseCount, (1.0 * winCount / numOfMatches) * 100);
        }
    }
}
