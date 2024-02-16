package Lesson07_Exams.MoreExams.E03;

import java.util.Scanner;

public class P01_EasterLunch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int countKozunaks = Integer.parseInt(scanner.nextLine());
        int countEggCrates = Integer.parseInt(scanner.nextLine());
        int kilogramsKurabii = Integer.parseInt(scanner.nextLine());

        double kozunakPrice = 3.20;
        double eggPricePerCrate = 4.35;
        double kurabiiPricePerKg = 5.40;
        double eggDyePricePerEgg = 0.15;

        double totalKozunakPrice = countKozunaks * kozunakPrice;
        double totalEggPrice = countEggCrates * eggPricePerCrate;
        double totalKurabiiPrice = kilogramsKurabii * kurabiiPricePerKg;
        double totalEggDyePrice = countEggCrates * 12 * eggDyePricePerEgg;

        double totalPrice = totalKozunakPrice + totalEggPrice + totalKurabiiPrice + totalEggDyePrice;

        System.out.printf("%.2f", totalPrice);
    }
}
