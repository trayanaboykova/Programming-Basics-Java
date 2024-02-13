package Exams.MoreExams.E04;

import java.util.Scanner;

public class P04_TouristShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        int productsCount = 0;
        double totalCost = 0;

        String command = scanner.nextLine();

        while (!command.equals("Stop")) {
            String productName = command;
            double productPrice = Double.parseDouble(scanner.nextLine());

            productsCount++;
            if (productsCount % 3 == 0) {
                productPrice /= 2; // applying the discount for every third product
            }

            if (budget >= productPrice) {
                budget -= productPrice;
                totalCost += productPrice;
            } else {
                System.out.println("You don't have enough money!");
                System.out.printf("You need %.2f leva!", productPrice - budget);
                return;
            }

            command = scanner.nextLine();
        }

        System.out.printf("You bought %d products for %.2f leva.", productsCount, totalCost);
    }
}
