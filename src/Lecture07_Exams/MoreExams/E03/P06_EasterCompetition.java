package Lecture07_Exams.MoreExams.E03;

import java.util.Scanner;

public class P06_EasterCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        String winner = "";
        int maxPoints = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            String bakerName = scanner.nextLine();
            int totalPoints = 0;

            String command = scanner.nextLine();
            while (!command.equals("Stop")) {
                int points = Integer.parseInt(command);
                totalPoints += points;
                command = scanner.nextLine();
            }

            System.out.printf("%s has %d points.%n", bakerName, totalPoints);

            if (totalPoints > maxPoints) {
                maxPoints = totalPoints;
                winner = bakerName;
                System.out.printf("%s is the new number 1!%n", winner);
            }
        }

        System.out.printf("%s won competition with %d points!%n", winner, maxPoints);
    }
}
