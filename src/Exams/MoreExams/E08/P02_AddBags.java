package Exams.MoreExams.E08;

import java.util.Scanner;

public class P02_AddBags {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalLuggagePrice = 0;
        double price = Double.parseDouble(scanner.nextLine());
        double kgOfLuggage = Double.parseDouble(scanner.nextLine());
        int dayBeforeDeparture = Integer.parseInt(scanner.nextLine());
        int numOfLuggage = Integer.parseInt(scanner.nextLine());

        if (kgOfLuggage < 10) {
            totalLuggagePrice = price * 0.2;
        } else if (kgOfLuggage >= 10 && kgOfLuggage <= 20) {
            totalLuggagePrice = price * 0.5;
        } else {
            totalLuggagePrice = price;
        }

        if (dayBeforeDeparture < 7) {
            totalLuggagePrice = totalLuggagePrice + (totalLuggagePrice * 0.4);
        } else if (dayBeforeDeparture >= 7 && dayBeforeDeparture <= 30) {
            totalLuggagePrice = totalLuggagePrice + (totalLuggagePrice * 0.15);
        } else {
            totalLuggagePrice = totalLuggagePrice + (totalLuggagePrice * 0.1);
        }

        totalLuggagePrice = totalLuggagePrice * numOfLuggage;

        System.out.printf("The total price of bags is: %.2f lv.", totalLuggagePrice);
    }
}
