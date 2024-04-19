package Lesson03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P06_TruckDriver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        double kilometersPerMonth = Double.parseDouble(scanner.nextLine());

        double payPerKilometer = 0;

        switch (season) {
            case "Spring":
            case "Autumn":
                if (kilometersPerMonth <= 5000) {
                    payPerKilometer = 0.75;
                } else if (kilometersPerMonth <= 10000) {
                    payPerKilometer = 0.95;
                } else {
                    payPerKilometer = 1.45;
                }
                break;
            case "Summer":
                if (kilometersPerMonth <= 5000) {
                    payPerKilometer = 0.90;
                } else if (kilometersPerMonth <= 10000) {
                    payPerKilometer = 1.10;
                } else {
                    payPerKilometer = 1.45;
                }
                break;
            case "Winter":
                if (kilometersPerMonth <= 5000) {
                    payPerKilometer = 1.05;
                } else if (kilometersPerMonth <= 10000) {
                    payPerKilometer = 1.25;
                } else {
                    payPerKilometer = 1.45;
                }
                break;
        }

        double salary = (kilometersPerMonth * payPerKilometer * 4) * 0.90;

        System.out.printf("%.2f", salary);
    }
}
