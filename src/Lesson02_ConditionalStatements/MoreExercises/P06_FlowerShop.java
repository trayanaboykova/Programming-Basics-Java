package Lesson02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P06_FlowerShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int magnoliasCount = Integer.parseInt(scanner.nextLine());
        int hyacinthsCount = Integer.parseInt(scanner.nextLine());
        int rosesCount = Integer.parseInt(scanner.nextLine());
        int cactiCount = Integer.parseInt(scanner.nextLine());
        double giftPrice = Double.parseDouble(scanner.nextLine());

        double priceMagnolia = 3.25;
        double priceHyacinth = 4.00;
        double priceRose = 3.50;
        double priceCactus = 8.00;

        double totalRevenue = (magnoliasCount * priceMagnolia) +
                (hyacinthsCount * priceHyacinth) +
                (rosesCount * priceRose) +
                (cactiCount * priceCactus);

        double taxes = totalRevenue * 0.05;

        double profitAfterTaxes = totalRevenue - taxes;

        double remainingMoney = profitAfterTaxes - giftPrice;

        if (remainingMoney >= 0) {
            System.out.println("She is left with " + (int) Math.floor(remainingMoney) + " leva.");
        } else {
            System.out.println("She will have to borrow " + (int) Math.ceil(-remainingMoney) + " leva.");
        }
    }
}
