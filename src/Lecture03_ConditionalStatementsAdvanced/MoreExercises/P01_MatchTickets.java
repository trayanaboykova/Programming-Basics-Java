package Lecture03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P01_MatchTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String category = scanner.nextLine();
        int groupSize = Integer.parseInt(scanner.nextLine());

        double transportationPercentage;
        if (groupSize >= 50) {
            transportationPercentage = 0.25;
        } else if (groupSize >= 25) {
            transportationPercentage = 0.4;
        } else if (groupSize >= 10) {
            transportationPercentage = 0.5;
        } else if (groupSize >= 5) {
            transportationPercentage = 0.6;
        } else {
            transportationPercentage = 0.75;
        }

        budget -= budget * transportationPercentage;

        double ticketPrice = category.equals("VIP") ? 499.99 : 249.99;
        double totalPrice = ticketPrice * groupSize;

        if (budget >= totalPrice) {
            double leftMoney = budget - totalPrice;
            System.out.printf("Yes! You have %.2f leva left.%n", leftMoney);
        } else {
            double neededMoney = totalPrice - budget;
            System.out.printf("Not enough money! You need %.2f leva.%n", neededMoney);
        }
    }
}
