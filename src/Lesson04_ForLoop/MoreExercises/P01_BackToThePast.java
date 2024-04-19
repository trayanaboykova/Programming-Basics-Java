package Lesson04_ForLoop.MoreExercises;

import java.util.Scanner;

public class P01_BackToThePast {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double inheritedMoney = Double.parseDouble(scanner.nextLine());
        int lastYear = Integer.parseInt(scanner.nextLine());

        int currentYear = 1800;
        int age = 18;

        double totalCosts = 0;
        for (int year = currentYear; year <= lastYear; year++, age++) {
            if (year % 2 == 0) {
                totalCosts += 12000;
            } else {
                totalCosts += 12000 + 50 * age;
            }
        }

        double remainingMoney = inheritedMoney - totalCosts;

        if (remainingMoney >= 0) {
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", remainingMoney);
        } else {
            System.out.printf("He will need %.2f dollars to survive.", -remainingMoney);
        }
    }
}
