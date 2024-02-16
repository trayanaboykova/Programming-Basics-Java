package Lesson07_Exams.MoreExams.E06;

import java.util.Scanner;

public class P01_PoolDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfPeople = Integer.parseInt(scanner.nextLine());
        double entranceFee = Double.parseDouble(scanner.nextLine());
        double sunbedPrice = Double.parseDouble(scanner.nextLine());
        double umbrellaPrice = Double.parseDouble(scanner.nextLine());

        int umbrellasNeeded = (int) Math.ceil(numberOfPeople / 2.0);
        int sunbedsNeeded = (int) Math.ceil(numberOfPeople * 0.75);

        double totalCost = numberOfPeople * entranceFee + umbrellasNeeded * umbrellaPrice + sunbedsNeeded * sunbedPrice;

        System.out.printf("%.2f lv.", totalCost);
    }
}
