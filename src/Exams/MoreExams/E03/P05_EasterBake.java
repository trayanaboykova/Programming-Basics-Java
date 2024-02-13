package Exams.MoreExams.E03;

import java.util.Scanner;

public class P05_EasterBake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfKozunaks = Integer.parseInt(scanner.nextLine());

        int totalSugar = 0;
        int totalFlour = 0;
        int maxSugar = Integer.MIN_VALUE;
        int maxFlour = Integer.MIN_VALUE;

        for (int i = 0; i < numberOfKozunaks; i++) {
            int sugar = Integer.parseInt(scanner.nextLine());
            int flour = Integer.parseInt(scanner.nextLine());

            totalSugar += sugar;
            totalFlour += flour;

            if (sugar > maxSugar) {
                maxSugar = sugar;
            }

            if (flour > maxFlour) {
                maxFlour = flour;
            }
        }

        int sugarPackages = (int) Math.ceil((double) totalSugar / 950);
        int flourPackages = (int) Math.ceil((double) totalFlour / 750);

        System.out.println("Sugar: " + sugarPackages);
        System.out.println("Flour: " + flourPackages);
        System.out.printf("Max used flour is %d grams, max used sugar is %d grams.%n", maxFlour, maxSugar);
    }
}
