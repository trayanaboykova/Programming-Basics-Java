package Exams.MoreExams.E07;

import java.util.Scanner;

public class P03_FitnessCard {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        char gender = scanner.nextLine().charAt(0);
        int age = Integer.parseInt(scanner.nextLine());
        String sport = scanner.nextLine();

        double cardPrice = 0;

        switch (sport) {
            case "Gym":
                cardPrice = gender == 'm' ? 42 : 35;
                break;
            case "Boxing":
                cardPrice = gender == 'm' ? 41 : 37;
                break;
            case "Yoga":
                cardPrice = gender == 'm' ? 45 : 42;
                break;
            case "Zumba":
                cardPrice = gender == 'm' ? 34 : 31;
                break;
            case "Dances":
                cardPrice = gender == 'm' ? 51 : 53;
                break;
            case "Pilates":
                cardPrice = gender == 'm' ? 39 : 37;
                break;
        }

        if (age <= 19) {
            cardPrice *= 0.8; // 20% discount for students
        }

        if (budget >= cardPrice) {
            System.out.printf("You purchased a 1 month pass for %s.", sport);
        } else {
            double moneyNeeded = cardPrice - budget;
            System.out.printf("You don't have enough money! You need $%.2f more.", moneyNeeded);
        }
    }
}
