package Lesson02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P08_FuelTankPart2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelAmount = Double.parseDouble(scanner.nextLine());
        String hasCard = scanner.nextLine();

        double pricePerLiter = 0.0;
        double discount = 0.0;

        switch (fuelType) {
            case "Gasoline":
                pricePerLiter = 2.22;
                discount = hasCard.equals("Yes") ? 0.18 : 0.0;
                break;
            case "Diesel":
                pricePerLiter = 2.33;
                discount = hasCard.equals("Yes") ? 0.12 : 0.0;
                break;
            case "Gas":
                pricePerLiter = 0.93;
                discount = hasCard.equals("Yes") ? 0.08 : 0.0;
                break;
            default:
                System.out.println("Invalid fuel type.");
                return;
        }

        double cost = fuelAmount * (pricePerLiter - discount);

        if (fuelAmount > 25) {
            cost *= 0.90; // 10% discount
        } else if (fuelAmount >= 20) {
            cost *= 0.92; // 8% discount
        }

        System.out.printf("%.2f lv.", cost);
    }
}
