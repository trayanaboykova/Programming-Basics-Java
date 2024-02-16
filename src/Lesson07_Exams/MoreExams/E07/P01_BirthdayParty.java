package Lesson07_Exams.MoreExams.E07;

import java.util.Scanner;

public class P01_BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double rent = Double.parseDouble(scanner.nextLine());

        double cakePrice = rent * 0.2;
        double drinksPrice = cakePrice * 0.55; // Напитките са 45% по-малко от цената на тортата
        double animatorPrice = rent / 3;

        double totalBudget = rent + cakePrice + drinksPrice + animatorPrice;

        System.out.printf("%.2f", totalBudget);
    }
}
