package Lecture07_Exams.RegularExam;

import java.util.Scanner;

public class P01_MiningRig {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int videoCard = Integer.parseInt(scanner.nextLine());
        int adapter = Integer.parseInt(scanner.nextLine());
        double electricity = Double.parseDouble(scanner.nextLine());
        double profit = Double.parseDouble(scanner.nextLine());

        int videoCardCount = 13;
        int videoCardPrice = videoCardCount * videoCard;
        int adapterCount = 13;
        int adapterPrice = adapterCount * adapter;
        int totalSpent = videoCardPrice + adapterPrice + 1000;
        double dayProfit = profit - electricity;
        double totalProfit = videoCardCount * dayProfit;
        double days = totalSpent / totalProfit;
        System.out.println(totalSpent);
        System.out.printf("%.0f", Math.ceil(days));
    }
}
