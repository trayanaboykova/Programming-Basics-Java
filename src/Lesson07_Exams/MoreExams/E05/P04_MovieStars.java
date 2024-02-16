package Lesson07_Exams.MoreExams.E05;

import java.util.Scanner;

public class P04_MovieStars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double remainingBudget = budget;

        String actorName = scanner.nextLine();
        while (!actorName.equals("ACTION")) {
            double payment;
            if (actorName.length() <= 15) {
                payment = Double.parseDouble(scanner.nextLine());
            } else {
                payment = remainingBudget * 0.2;
            }

            remainingBudget -= payment;

            if (remainingBudget < 0) {
                double neededBudget = Math.abs(remainingBudget);
                System.out.printf("We need %.2f leva for our actors.", neededBudget);
                return;
            }

            actorName = scanner.nextLine();
        }

        System.out.printf("We are left with %.2f leva.", remainingBudget);
    }
}
