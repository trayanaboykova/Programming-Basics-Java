package Lesson07_Exams.MoreExams.E04;

import java.util.Scanner;

public class P03_MobileOperator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String period = scanner.nextLine();
        String type = scanner.nextLine();
        String mobileInternet = scanner.nextLine();
        int months = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        switch (mobileInternet) {
            case "yes":
                if (period.equals("one")) {
                    switch (type) {
                        case "Small":
                            totalPrice = months * (9.98 + 5.50);
                            break;
                        case "Middle":
                            totalPrice = months * (18.99 + 4.35);
                            break;
                        case "Large":
                            totalPrice = months * (25.98 + 4.35);
                            break;
                        case "ExtraLarge":
                            totalPrice = months * (35.99 + 3.85);
                            break;
                    }
                } else if (period.equals("two")) {
                    switch (type) {
                        case "Small":
                            totalPrice = months * (8.58 + 5.50);
                            totalPrice = totalPrice - (totalPrice * 0.0375);
                            break;
                        case "Middle":
                            totalPrice = months * (17.09 + 4.35);
                            totalPrice = totalPrice - (totalPrice * 0.0375);
                            break;
                        case "Large":
                            totalPrice = months * (23.59 + 4.35);
                            totalPrice = totalPrice - (totalPrice * 0.0375);
                            break;
                        case "ExtraLarge":
                            totalPrice = months * (31.79 + 3.85);
                            totalPrice = totalPrice - (totalPrice * 0.0375);
                            break;
                    }
                }
                break;
            case "no":
                if (period.equals("one")) {
                    switch (type) {
                        case "Small":
                            totalPrice = months * 9.98;
                            break;
                        case "Middle":
                            totalPrice = months * 18.99;
                            break;
                        case "Large":
                            totalPrice = months * 25.98;
                            break;
                        case "ExtraLarge":
                            totalPrice = months * 35.99;
                            break;
                    }
                } else if (period.equals("two")) {
                    switch (type) {
                        case "Small":
                            totalPrice = months * 8.58;
                            totalPrice = totalPrice - (totalPrice * 0.0375);
                            break;
                        case "Middle":
                            totalPrice = months * 17.09;
                            totalPrice = totalPrice - (totalPrice * 0.0375);
                            break;
                        case "Large":
                            totalPrice = months * 23.59;
                            totalPrice = totalPrice - (totalPrice * 0.0375);
                            break;
                        case "ExtraLarge":
                            totalPrice = months * 31.79;
                            totalPrice = totalPrice - (totalPrice * 0.0375);
                            break;
                    }
                }
                break;
        }

        System.out.printf("%.2f lv.", totalPrice);
    }
}
