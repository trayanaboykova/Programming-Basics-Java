package Exams.MoreExams.E02;

import java.util.Scanner;

public class P02_GodzillaVSKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int extras = Integer.parseInt(scanner.nextLine());
        double costumePricePerExtra = Double.parseDouble(scanner.nextLine());

        double decorPrice = budget * 0.1;
        double totalCostumePrice = extras * costumePricePerExtra;

        if (extras > 150) {
            totalCostumePrice -= totalCostumePrice * 0.1;
        }

        double totalExpenses = decorPrice + totalCostumePrice;

        if (totalExpenses > budget) {
            double neededMoney = totalExpenses - budget;
            System.out.println("Not enough money!");
            System.out.printf("Wingard needs %.2f leva more.", neededMoney);
        } else {
            double remainingMoney = budget - totalExpenses;
            System.out.println("Action!");
            System.out.printf("Wingard starts filming with %.2f leva left.", remainingMoney);
        }
    }
}
