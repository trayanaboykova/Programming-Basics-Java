package Lesson05_WhileLoop.MoreExercises;

import java.util.Scanner;

public class P02_ReportSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int targetAmount = Integer.parseInt(scanner.nextLine());
        int collectedCashAmount = 0;
        int collectedCardAmount = 0;
        int cashTransactionsCount = 0;
        int cardTransactionsCount = 0;
        int totalCount = 0;

        while (true) {

            String input = scanner.nextLine();

            if (input.equals("End")) {
                System.out.println("Failed to collect required money for charity.");
                return;
            }

            if(!input.matches("\\d+")){
                System.out.println("Please ensure the input is a valid number.");
                continue;
            }

            int price = Integer.parseInt(input);

            totalCount++;

            if (totalCount % 2 != 0) { // Cash payment
                if(price > 100) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    collectedCashAmount += price;
                    cashTransactionsCount++;
                }
            } else { // Card payment
                if(price < 10) {
                    System.out.println("Error in transaction!");
                } else {
                    System.out.println("Product sold!");
                    collectedCardAmount += price;
                    cardTransactionsCount++;
                }
            }

            if(collectedCashAmount + collectedCardAmount >= targetAmount){
                break;
            }
        }

        double averageCash = (double) collectedCashAmount / cashTransactionsCount;
        double averageCard = (double) collectedCardAmount / cardTransactionsCount;

        System.out.printf("Average CS: %.2f%n", averageCash);
        System.out.printf("Average CC: %.2f%n", averageCard);
    }
}