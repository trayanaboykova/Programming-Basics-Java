package Lecture07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P01_BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int annualFee = Integer.parseInt(scanner.nextLine());

        double basketballShoes = annualFee - (annualFee * 0.4);
        double basketballKit = basketballShoes - (basketballShoes * 0.2);
        double basketballBall = basketballKit / 4;
        double basketballAccessories = basketballBall / 5;

        double totalExpenses = annualFee + basketballShoes + basketballKit + basketballBall + basketballAccessories;

        System.out.printf("%.2f", totalExpenses);
    }
}
