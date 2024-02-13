package Exams.MoreExams.E02;

import java.util.Scanner;

public class P04_CinemaVoucher {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int voucherValue = Integer.parseInt(scanner.nextLine());

        int ticketsCount = 0;
        int otherPurchasesCount = 0;

        while (true) {
            String purchase = scanner.nextLine();
            if (purchase.equals("End")) {
                break;
            }

            int purchasePrice;
            if (purchase.length() > 8) {
                purchasePrice = purchase.charAt(0) + purchase.charAt(1);
            } else {
                purchasePrice = purchase.charAt(0);
            }

            if (purchasePrice > voucherValue) {
                break;
            }

            if (purchase.length() > 8) {
                ticketsCount++;
            } else {
                otherPurchasesCount++;
            }

            voucherValue -= purchasePrice;
        }

        System.out.println(ticketsCount);
        System.out.println(otherPurchasesCount);
    }
}
