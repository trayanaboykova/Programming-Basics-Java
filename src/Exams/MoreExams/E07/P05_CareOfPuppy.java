package Exams.MoreExams.E07;

import java.util.Scanner;

public class P05_CareOfPuppy {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int foodQuantity = Integer.parseInt(scanner.nextLine());
        int totalFoodEaten = 0;

        String input = scanner.nextLine();
        while (!input.equals("Adopted")) {
            int foodEaten = Integer.parseInt(input);
            totalFoodEaten += foodEaten;
            input = scanner.nextLine();
        }

        int foodLeft = foodQuantity * 1000 - totalFoodEaten;

        if (foodLeft >= 0) {
            System.out.printf("Food is enough! Leftovers: %d grams.%n", foodLeft);
        } else {
            int neededFood = Math.abs(foodLeft);
            System.out.printf("Food is not enough. You need %d grams more.%n", neededFood);
        }
    }
}
