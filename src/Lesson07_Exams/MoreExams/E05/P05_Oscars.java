package Lesson07_Exams.MoreExams.E05;

import java.util.Scanner;

public class P05_Oscars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String actorName = scanner.nextLine();
        double academyPoints = Double.parseDouble(scanner.nextLine());
        int numberOfJudges = Integer.parseInt(scanner.nextLine());

        double totalPoints = academyPoints;

        for (int i = 0; i < numberOfJudges; i++) {
            String judgeName = scanner.nextLine();
            double judgePoints = Double.parseDouble(scanner.nextLine());

            totalPoints += (judgeName.length() * judgePoints) / 2;

            if (totalPoints >= 1250.5) {
                System.out.printf("Congratulations, %s got a nominee for leading role with %.1f!", actorName, totalPoints);
                return;
            }
        }

        double neededPoints = 1250.5 - totalPoints;
        System.out.printf("Sorry, %s you need %.1f more!", actorName, neededPoints);
    }
}
