package Lesson02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P07_FuelTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fuelType = scanner.nextLine();
        double fuelAmount = Double.parseDouble(scanner.nextLine());

        fuelType = fuelType.toLowerCase();

        if (!fuelType.equals("diesel") && !fuelType.equals("gasoline") && !fuelType.equals("gas")) {
            System.out.println("Invalid fuel!");
        } else {
            if (fuelAmount >= 25) {
                System.out.println("You have enough " + fuelType + ".");
            } else {
                System.out.println("Fill your tank with " + fuelType + "!");
            }
        }
    }
}
