package Lesson04_ForLoop.Exercise;

import java.util.Scanner;

public class P04_CleverLily {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        double washingMachine = Double.parseDouble(scan.nextLine());
        int toyPrice = Integer.parseInt(scan.nextLine());

        double moneyForBD = 0;
        int toys = 0;
        int countMoney = 0;

        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                if (i == 2) {
                    moneyForBD = 10.00;
                } else {
                    moneyForBD += 10.00 * i / 2;
                }
                countMoney++;
            } else {
                toys++;
            }
        }
        double money = moneyForBD - countMoney;

        double moneyFromToys = toyPrice * toys;

        double totalMoney = money + moneyFromToys;

        if (totalMoney >= washingMachine) {
            System.out.printf("Yes! %.2f", totalMoney - washingMachine);
        } else {
            System.out.printf("No! %.2f", washingMachine - totalMoney);
        }
    }

}

