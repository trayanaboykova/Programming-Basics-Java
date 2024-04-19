package Lesson04_ForLoop.MoreExercises;

import java.util.Scanner;

public class P06_Bills {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int months = Integer.parseInt(scanner.nextLine());

        double totalElectricity = 0;
        final double waterPerMonth = 20.0;
        final double internetPerMonth = 15.0;
        double totalWater = months * waterPerMonth;
        double totalInternet = months * internetPerMonth;
        double totalOther = 0;
        double totalExpenses = 0;

        for (int i = 0; i < months; i++) {
            double electricity = Double.parseDouble(scanner.nextLine());
            totalElectricity += electricity;
            double monthlyCosts = electricity + waterPerMonth + internetPerMonth;
            double other = monthlyCosts * 1.20;
            totalOther += other;
        }

        totalExpenses = totalElectricity + totalWater + totalInternet + totalOther;
        double averageExpenses = totalExpenses / months;

        System.out.printf("Electricity: %.2f lv\n", totalElectricity);
        System.out.printf("Water: %.2f lv\n", totalWater);
        System.out.printf("Internet: %.2f lv\n", totalInternet);
        System.out.printf("Other: %.2f lv\n", totalOther);
        System.out.printf("Average: %.2f lv\n", averageExpenses);

    }
}
