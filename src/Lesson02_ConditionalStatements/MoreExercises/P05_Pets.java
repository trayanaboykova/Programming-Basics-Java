package Lesson02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P05_Pets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int daysAway = Integer.parseInt(scanner.nextLine());
        int foodLeft = Integer.parseInt(scanner.nextLine());
        double foodPerDayDog = Double.parseDouble(scanner.nextLine());
        double foodPerDayCat = Double.parseDouble(scanner.nextLine());
        double foodPerDayTurtleGrams = Double.parseDouble(scanner.nextLine());

        double foodPerDayTurtle = foodPerDayTurtleGrams / 1000;

        double totalFoodDog = foodPerDayDog * daysAway;
        double totalFoodCat = foodPerDayCat * daysAway;
        double totalFoodTurtle = foodPerDayTurtle * daysAway;

        double totalFoodNeeded = totalFoodDog + totalFoodCat + totalFoodTurtle;

        double foodDifference = foodLeft - totalFoodNeeded;

        if (foodDifference >= 0) {
            System.out.println((int) foodDifference + " kilos of food left.");
        } else {
            System.out.println((int) Math.ceil(-foodDifference) + " more kilos of food are needed.");
        }
    }
}
