package Exams.MoreExams.E04;

import java.util.Scanner;

public class P06_VetParking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double totalMoney = 0;
        int days = Integer.parseInt(scanner.nextLine());
        int hours = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= days; i++) {
            double dayTotalMoney = 0;
            for (int j = 1; j <= hours; j++) {

                if (i % 2 == 0 && j % 2 != 0) {
                    dayTotalMoney += 2.50;
                } else if (i % 2 != 0 && j % 2 == 0) {
                    dayTotalMoney += 1.25;
                } else {
                    dayTotalMoney += 1;
                }

            }
            totalMoney += dayTotalMoney;
            System.out.printf("Day: %d - %.2f leva\n", i, dayTotalMoney);
        }
        System.out.printf("Total: %.2f leva\n", totalMoney);
    }
}
