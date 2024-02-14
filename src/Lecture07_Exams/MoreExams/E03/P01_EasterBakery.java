package Lecture07_Exams.MoreExams.E03;

import java.util.Scanner;

public class P01_EasterBakery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double flourPricePerKg = Double.parseDouble(scanner.nextLine());
        double flourKg = Double.parseDouble(scanner.nextLine());
        double sugarKg = Double.parseDouble(scanner.nextLine());
        int eggCrates = Integer.parseInt(scanner.nextLine());
        int yeastPackets = Integer.parseInt(scanner.nextLine());

        double sugarPricePerKg = flourPricePerKg * 0.75;
        double eggPricePerCrate = flourPricePerKg * 1.1;
        double yeastPricePerPacket = sugarPricePerKg * 0.2;

        double flourTotal = flourPricePerKg * flourKg;
        double sugarTotal = sugarPricePerKg * sugarKg;
        double eggTotal = eggPricePerCrate * eggCrates;
        double yeastTotal = yeastPricePerPacket * yeastPackets;

        double totalPrice = flourTotal + sugarTotal + eggTotal + yeastTotal;

        System.out.printf("%.2f", totalPrice);
    }
}
