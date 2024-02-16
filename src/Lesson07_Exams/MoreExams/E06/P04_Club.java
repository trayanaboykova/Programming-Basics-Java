package Lesson07_Exams.MoreExams.E06;

import java.util.Scanner;

public class P04_Club {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double targetIncome = Double.parseDouble(scanner.nextLine());
        double totalIncome = 0;

        while (totalIncome < targetIncome) {
            String cocktailName = scanner.nextLine();
            if (cocktailName.equals("Party!")) {
                System.out.printf("We need %.2f leva more.\n", targetIncome - totalIncome);
                System.out.printf("Club income - %.2f leva.", totalIncome);
                return;
            }
            int cocktailCount = Integer.parseInt(scanner.nextLine());

            double cocktailPrice = cocktailName.length() * 1.0;
            double orderPrice = cocktailPrice * cocktailCount;

            if (orderPrice % 2 != 0) {
                orderPrice *= 0.75; // 25% discount for odd order price
            }

            totalIncome += orderPrice;
        }

        System.out.println("Target acquired.");
        System.out.printf("Club income - %.2f leva.", totalIncome);
    }
}
