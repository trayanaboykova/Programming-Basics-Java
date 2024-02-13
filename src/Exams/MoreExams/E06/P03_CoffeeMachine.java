package Exams.MoreExams.E06;

import java.util.Scanner;

public class P03_CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String drink = scanner.nextLine();
        String sugar = scanner.nextLine();
        int quantity = Integer.parseInt(scanner.nextLine());

        double price = 0;
        switch (drink) {
            case "Espresso":
                price = (sugar.equals("Without")) ? 0.90 * 0.65 : (sugar.equals("Normal")) ? 1.00 : 1.20;
                if (quantity >= 5) price *= 0.75;
                break;
            case "Cappuccino":
                price = (sugar.equals("Without")) ? 1.00 * 0.65 : (sugar.equals("Normal")) ? 1.20 : 1.60;
                break;
            case "Tea":
                price = (sugar.equals("Without")) ? 0.50 * 0.65 : (sugar.equals("Normal")) ? 0.60 : 0.70;
                break;
        }

        double totalCost = price * quantity;

        if (totalCost > 15) {
            totalCost *= 0.80;
        }
        System.out.printf("You bought %d cups of %s for %.2f lv.", quantity, drink, totalCost);
    }
}
