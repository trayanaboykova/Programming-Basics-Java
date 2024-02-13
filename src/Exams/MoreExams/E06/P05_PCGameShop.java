package Exams.MoreExams.E06;

import java.util.Scanner;

public class P05_PCGameShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalGamesSold = Integer.parseInt(scanner.nextLine());

        int hearthstoneSales = 0;
        int forniteSales = 0;
        int overwatchSales = 0;
        int otherGamesSales = 0;

        for (int i = 0; i < totalGamesSold; i++) {
            String gameName = scanner.nextLine();
            switch (gameName) {
                case "Hearthstone":
                    hearthstoneSales++;
                    break;
                case "Fornite":
                    forniteSales++;
                    break;
                case "Overwatch":
                    overwatchSales++;
                    break;
                default:
                    otherGamesSales++;
                    break;
            }
        }

        double hearthstonePercentage = (double) hearthstoneSales / totalGamesSold * 100;
        double fornitePercentage = (double) forniteSales / totalGamesSold * 100;
        double overwatchPercentage = (double) overwatchSales / totalGamesSold * 100;
        double otherGamesPercentage = (double) otherGamesSales / totalGamesSold * 100;

        System.out.printf("Hearthstone - %.2f%%\n", hearthstonePercentage);
        System.out.printf("Fornite - %.2f%%\n", fornitePercentage);
        System.out.printf("Overwatch - %.2f%%\n", overwatchPercentage);
        System.out.printf("Others - %.2f%%\n", otherGamesPercentage);
    }
}
