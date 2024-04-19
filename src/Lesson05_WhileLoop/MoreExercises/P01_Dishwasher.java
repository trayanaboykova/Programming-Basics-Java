package Lesson05_WhileLoop.MoreExercises;

import java.util.Scanner;

public class P01_Dishwasher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int detergentBottles = Integer.parseInt(scanner.nextLine());

        int totalDetergent = detergentBottles * 750;

        String input;
        int cycle = 1;
        int totalDishes = 0;
        int totalPots = 0;

        while (!(input = scanner.nextLine()).equals("End")) {
            int items = Integer.parseInt(input);
            int neededDetergent;

            if (cycle % 3 == 0) {
                neededDetergent = items * 15;
                totalPots += items;
            } else {
                neededDetergent = items * 5;
                totalDishes += items;
            }

            if (totalDetergent >= neededDetergent) {
                totalDetergent -= neededDetergent;
            } else {
                System.out.printf("Not enough detergent, %d ml. more necessary!%n", neededDetergent - totalDetergent);
                return;
            }

            cycle++;
        }

        System.out.println("Detergent was enough!");
        System.out.printf("%d dishes and %d pots were washed.%n", totalDishes, totalPots);
        System.out.printf("Leftover detergent %d ml.%n", totalDetergent);
    }
}
