package Lecture07_Exams.MoreExams.E03;

import java.util.Scanner;

public class P02_EasterGuests {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int guests = Integer.parseInt(scanner.nextLine());
        int budget = Integer.parseInt(scanner.nextLine());

        int breadNeeded = (int) Math.ceil(guests / 3.0); // Round up to the nearest integer
        int eggsNeeded = guests * 2;

        double breadCost = breadNeeded * 4.0;
        double eggsCost = eggsNeeded * 0.45;

        double totalCost = breadCost + eggsCost;

        if (totalCost <= budget) {
            double leftMoney = budget - totalCost;
            System.out.printf("Lyubo bought %d Easter bread and %d eggs.%n", breadNeeded, eggsNeeded);
            System.out.printf("He has %.2f lv. left.", leftMoney);
        } else {
            double neededMoney = totalCost - budget;
            System.out.println("Lyubo doesn't have enough money.");
            System.out.printf("He needs %.2f lv. more.", neededMoney);
        }
    }
}
