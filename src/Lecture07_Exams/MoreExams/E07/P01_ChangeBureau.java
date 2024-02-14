package Lecture07_Exams.MoreExams.E07;

import java.util.Scanner;

public class P01_ChangeBureau {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int bitcoins = Integer.parseInt(scanner.nextLine());
        double chineseYuans = Double.parseDouble(scanner.nextLine());
        double commission = Double.parseDouble(scanner.nextLine());

        double bitcoinsToLeva = bitcoins * 1168;
        double chineseYuansToDollars = chineseYuans * 0.15;
        double dollarsToLeva = chineseYuansToDollars * 1.76;

        double totalLeva = bitcoinsToLeva + dollarsToLeva;
        double totalEuros = totalLeva / 1.95;

        double commissionAmount = totalEuros * (commission / 100);
        double finalAmount = totalEuros - commissionAmount;

        System.out.printf("%.2f", finalAmount);
    }
}
