package Lesson02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P03_Harvest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int vineyardArea = Integer.parseInt(scanner.nextLine());
        double grapesPerSquareMeter = Double.parseDouble(scanner.nextLine());
        int desiredLitersOfWine = Integer.parseInt(scanner.nextLine());
        int numberOfWorkers = Integer.parseInt(scanner.nextLine());

        double totalGrapes = vineyardArea * grapesPerSquareMeter;

        double grapesForWine = 0.4 * totalGrapes;

        double wineProduced = grapesForWine / 2.5;

        int totalWine = (int) wineProduced;

        if (totalWine < desiredLitersOfWine) {
            double exactShortage = desiredLitersOfWine - wineProduced;
            int roundedShortage = (int) Math.floor(exactShortage);
            System.out.println("It will be a tough winter! More " + roundedShortage + " liters wine needed.");
        } else {
            System.out.println("Good harvest this year! Total wine: " + totalWine + " liters.");

            int remainingWine = totalWine - desiredLitersOfWine;
            int winePerWorker = (int) Math.ceil((double) remainingWine / numberOfWorkers);

            System.out.println(remainingWine + " liters left -> " + winePerWorker + " liters per person.");
        }
    }
}
