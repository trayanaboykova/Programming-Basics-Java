package Exams.MoreExams.E05;

import java.util.Scanner;

public class P03_MovieDestination {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String destination = scanner.nextLine();
        String season = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());

        double dailyCost = 0;

        switch (destination) {
            case "Dubai":
                switch (season) {
                    case "Winter":
                        dailyCost = 45000;
                        break;
                    case "Summer":
                        dailyCost = 40000;
                        break;
                }
                break;
            case "Sofia":
                switch (season) {
                    case "Winter":
                        dailyCost = 17000;
                        break;
                    case "Summer":
                        dailyCost = 12500;
                        break;
                }
                dailyCost *= 1.25; // 25% increase for Sofia
                break;
            case "London":
                switch (season) {
                    case "Winter":
                        dailyCost = 24000;
                        break;
                    case "Summer":
                        dailyCost = 20250;
                        break;
                }
                break;
        }

        double totalCost = dailyCost * days;

        if (destination.equals("Dubai")) {
            totalCost *= 0.7; // 30% discount for Dubai
        }

        double diff = Math.abs(budget - totalCost);
        if (budget >= totalCost) {
            System.out.printf("The budget for the movie is enough! We have %.2f leva left!", budget - totalCost);
        } else {
            System.out.printf("The director needs %.2f leva more!", diff);
        }
    }
}
