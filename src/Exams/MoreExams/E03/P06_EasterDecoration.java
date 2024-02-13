package Exams.MoreExams.E03;

import java.util.Scanner;

public class P06_EasterDecoration {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int clients = Integer.parseInt(scanner.nextLine());
        double totalBill = 0;

        for (int i = 0; i < clients; i++) {
            int basketCount = 0;
            int wreathCount = 0;
            int bunnyCount = 0;

            String command = scanner.nextLine();
            while (!command.equals("Finish")) {
                switch (command) {
                    case "basket":
                        basketCount++;
                        break;
                    case "wreath":
                        wreathCount++;
                        break;
                    case "chocolate bunny":
                        bunnyCount++;
                        break;
                }
                command = scanner.nextLine();
            }

            int totalCount = basketCount + wreathCount + bunnyCount;
            double currentBill = basketCount * 1.50 + wreathCount * 3.80 + bunnyCount * 7.00;

            if (totalCount % 2 == 0) {
                currentBill -= currentBill * 0.20;
            }

            totalBill += currentBill;
            System.out.printf("You purchased %d items for %.2f leva.%n", totalCount, currentBill);
        }

        double averageBill = totalBill / clients;
        System.out.printf("Average bill per client is: %.2f leva.%n", averageBill);
    }
}
