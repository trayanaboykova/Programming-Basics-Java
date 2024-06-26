package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P11_HappyCatParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        double sumToPayAfterParking = 0;

        for (int daysCount = 1; daysCount <= days; daysCount++) {

            double currentSum = 0;

            for (int hoursCount = 1; hoursCount <= hours; hoursCount++) {
                if (daysCount % 2 == 0 && hoursCount % 2 != 0) {
                    currentSum += 2.5;
                } else if (daysCount % 2 != 0 && hoursCount % 2 == 0) {
                    currentSum += 1.25;
                } else {
                    currentSum += 1;
                }
            }
            System.out.printf("Day: %d - %.2f leva\n", daysCount, currentSum);
            sumToPayAfterParking += currentSum;

        }
        System.out.printf("Total: %.2f leva", sumToPayAfterParking);
    }
}
