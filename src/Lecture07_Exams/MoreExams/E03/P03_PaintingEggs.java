package Lecture07_Exams.MoreExams.E03;

import java.util.Scanner;

public class P03_PaintingEggs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[][] prices = {
                {16, 12, 9},  // Големи яйца
                {13, 9, 7},   // Средни яйца
                {9, 8, 5}     // Малки яйца
        };
        String size = scanner.nextLine();
        String color = scanner.nextLine();
        int batches = Integer.parseInt(scanner.nextLine());

        double price = prices[getSizeIndex(size)][getColorIndex(color)];

        double income = batches * price;
        double expenses = 0.35 * income;
        double netIncome = income - expenses;

        System.out.printf("%.2f leva.", netIncome);
    }
    private static int getSizeIndex(String size) {
        switch (size) {
            case "Large":
                return 0;
            case "Medium":
                return 1;
            case "Small":
                return 2;
            default:
                return -1;
        }
    }
    private static int getColorIndex(String color) {
        switch (color) {
            case "Red":
                return 0;
            case "Green":
                return 1;
            case "Yellow":
                return 2;
            default:
                return -1;
        }
    }
}
