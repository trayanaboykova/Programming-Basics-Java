package Course03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P04_CarToGo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double budget = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();

        String carClass = "";
        String carType = "";
        double carPrice = 0;

        if (budget <= 100) {
            carClass = "Economy class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = budget * 0.35;
            } else {
                carType = "Jeep";
                carPrice = budget * 0.65;
            }
        } else if (budget > 100 && budget <= 500) {
            carClass = "Compact class";
            if (season.equals("Summer")) {
                carType = "Cabrio";
                carPrice = budget * 0.45;
            } else {
                carType = "Jeep";
                carPrice = budget * 0.80;
            }
        } else {
            carClass = "Luxury class";
            carType = "Jeep";
            carPrice = budget * 0.90;
        }

        System.out.println(carClass);
        System.out.printf("%s - %.2f", carType, carPrice);
    }
}
