package Lesson07_Exams.MoreExams.E04;

import java.util.Scanner;

public class P02_Safari {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        double fuelLiters = Double.parseDouble(scanner.nextLine());
        String dayOfWeek = scanner.nextLine();

        double fuelPrice = 2.10;
        double guidePrice = 100.00;

        double totalExpenses = fuelPrice * fuelLiters + guidePrice;

        if (dayOfWeek.equals("Saturday")) {
            totalExpenses *= 0.90; // 10% discount
        } else if (dayOfWeek.equals("Sunday")) {
            totalExpenses *= 0.80; // 20% discount
        }

        if (budget >= totalExpenses) {
            double moneyLeft = budget - totalExpenses;
            System.out.printf("Safari time! Money left: %.2f lv.", moneyLeft);
        } else {
            double moneyNeeded = totalExpenses - budget;
            System.out.printf("Not enough money! Money needed: %.2f lv.", moneyNeeded);
        }
    }
}
