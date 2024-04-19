package Lesson04_ForLoop.MoreExercises;

import java.util.Scanner;

public class P03_Logistics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfGoods = Integer.parseInt(scanner.nextLine());

        final int pricePerTonVan = 200;
        final int pricePerTonTruck = 175;
        final int pricePerTonTrain = 120;

        int totalWeight = 0;
        double totalCost = 0;

        int weightByVan = 0;
        int weightByTruck = 0;
        int weightByTrain = 0;

        for (int i = 0; i < numberOfGoods; i++) {
            int weight = Integer.parseInt(scanner.nextLine());

            if (weight <= 3) {
                totalCost += weight * pricePerTonVan;
                weightByVan += weight;
            } else if (weight <= 11) {
                totalCost += weight * pricePerTonTruck;
                weightByTruck += weight;
            } else {
                totalCost += weight * pricePerTonTrain;
                weightByTrain += weight;
            }

            totalWeight += weight;
        }

        double averageCostPerTon = totalCost / totalWeight;

        double percentVan = (double) weightByVan / totalWeight * 100;
        double percentTruck = (double) weightByTruck / totalWeight * 100;
        double percentTrain = (double) weightByTrain / totalWeight * 100;

        System.out.printf("%.2f\n", averageCostPerTon);
        System.out.printf("%.2f%%\n", percentVan);
        System.out.printf("%.2f%%\n", percentTruck);
        System.out.printf("%.2f%%\n", percentTrain);
    }
}
