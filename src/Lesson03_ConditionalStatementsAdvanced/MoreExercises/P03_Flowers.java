package Lesson03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P03_Flowers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int chrysanthemums = Integer.parseInt(scanner.nextLine());
        int roses = Integer.parseInt(scanner.nextLine());
        int tulips = Integer.parseInt(scanner.nextLine());
        String season = scanner.nextLine();
        char holiday = scanner.nextLine().charAt(0);

        double chrysanthemumsPrice = 0;
        double rosesPrice = 0;
        double tulipsPrice = 0;

        switch (season) {
            case "Spring":
            case "Summer":
                chrysanthemumsPrice = 2.00;
                rosesPrice = 4.10;
                tulipsPrice = 2.50;
                break;
            case "Autumn":
            case "Winter":
                chrysanthemumsPrice = 3.75;
                rosesPrice = 4.50;
                tulipsPrice = 4.15;
                break;
        }

        double totalPrice = chrysanthemums * chrysanthemumsPrice +
                roses * rosesPrice +
                tulips * tulipsPrice;

        if (holiday == 'Y') {
            totalPrice *= 1.15;
        }

        if (season.equals("Spring") && tulips > 7) {
            totalPrice *= 0.95;
        }

        if (season.equals("Winter") && roses >= 10) {
            totalPrice *= 0.90;
        }

        if ((chrysanthemums + roses + tulips) > 20) {
            totalPrice *= 0.80;
        }

        totalPrice += 2; // arrangement fee

        System.out.printf("%.2f", totalPrice);
    }
}
