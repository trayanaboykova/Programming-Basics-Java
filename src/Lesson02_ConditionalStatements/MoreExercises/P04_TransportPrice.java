package Lesson02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P04_TransportPrice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        String timeOfDay = scanner.nextLine();

        double taxiDayRate = 0.79;
        double taxiNightRate = 0.90;
        double busRate = 0.09;
        double trainRate = 0.06;

        double cheapestCost = Double.MAX_VALUE;

        double taxiCost = 0.70;
        if (timeOfDay.equals("day")) {
            taxiCost += n * taxiDayRate;
        } else {
            taxiCost += n * taxiNightRate;
        }
        cheapestCost = Math.min(cheapestCost, taxiCost);

        if (n >= 20) {
            double busCost = n * busRate;
            cheapestCost = Math.min(cheapestCost, busCost);
        }

        if (n >= 100) {
            double trainCost = n * trainRate;
            cheapestCost = Math.min(cheapestCost, trainCost);
        }

        System.out.printf("%.2f", cheapestCost);

    }
}
