package Lesson07_Exams.MoreExams.E07;

import java.util.Scanner;

public class P03_EnergyBooster {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fruit = scanner.nextLine();
        String size = scanner.nextLine();
        int sets = Integer.parseInt(scanner.nextLine());

        double pricePerGel = 0;

        switch (fruit) {
            case "Watermelon":
                pricePerGel = size.equals("small") ? 56 : 28.70;
                break;
            case "Mango":
                pricePerGel = size.equals("small") ? 36.66 : 19.60;
                break;
            case "Pineapple":
                pricePerGel = size.equals("small") ? 42.10 : 24.80;
                break;
            case "Raspberry":
                pricePerGel = size.equals("small") ? 20 : 15.20;
                break;
        }

        double totalPrice = pricePerGel * sets * (size.equals("small") ? 2 : 5);

        if (totalPrice >= 400 && totalPrice <= 1000) {
            totalPrice *= 0.85; // 15% discount
        } else if (totalPrice > 1000) {
            totalPrice *= 0.5; // 50% discount
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
