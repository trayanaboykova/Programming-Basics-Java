package Lecture07_Exams.MoreExams.E03;

import java.util.Scanner;

public class P02_EasterParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        double pricePerPerson = Double.parseDouble(scanner.nextLine());
        double budget = Double.parseDouble(scanner.nextLine());

        double totalCost = guests * pricePerPerson;

        if (guests >= 10 && guests <= 15) {
            totalCost *= 0.85; // 15% discount
        } else if (guests > 15 && guests <= 20) {
            totalCost *= 0.80; // 20% discount
        } else if (guests > 20) {
            totalCost *= 0.75; // 25% discount
        }

        double cakePrice = budget * 0.10;
        totalCost += cakePrice;

        if (totalCost <= budget) {
            System.out.printf("It is party time! %.2f leva left.", budget - totalCost);
        } else {
            System.out.printf("No party! %.2f leva needed.", totalCost - budget);
        }
    }
}
