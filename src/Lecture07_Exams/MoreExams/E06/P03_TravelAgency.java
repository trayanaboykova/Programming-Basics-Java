package Lecture07_Exams.MoreExams.E06;

import java.util.Scanner;

public class P03_TravelAgency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String city = scanner.nextLine();
        String pack = scanner.nextLine();
        String vip = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        double totalPrice = 0;

        if (days > 1) {

            if (days > 7) {
                days = days - 1;
            }

            if (!city.equals("Bansko") && !city.equals("Borovets") && !city.equals("Varna") && !city.equals("Burgas")
                    || !pack.equals("withEquipment") && !pack.equals("noEquipment") && !pack.equals("withBreakfast") &&
                    !pack.equals("noBreakfast")) {
                System.out.println("Invalid input!");
            } else {

                switch (city) {
                    case "Bansko":
                    case "Borovets":
                        switch (pack) {
                            case "withEquipment":
                                totalPrice = days * 100;
                                if (vip.equals("yes")) {
                                    totalPrice = totalPrice - (totalPrice * 0.1);
                                }
                                break;
                            case "noEquipment":
                                totalPrice = days * 80;
                                if (vip.equals("yes")) {
                                    totalPrice = totalPrice - (totalPrice * 0.05);
                                }
                                break;
                        }
                        break;
                    case "Varna":
                    case "Burgas":
                        switch (pack) {
                            case "withBreakfast":
                                totalPrice = days * 130;
                                if (vip.equals("yes")) {
                                    totalPrice = totalPrice - (totalPrice * 0.12);
                                }
                                break;
                            case "noBreakfast":
                                totalPrice = days * 100;
                                if (vip.equals("yes")) {
                                    totalPrice = totalPrice - (totalPrice * 0.07);
                                }
                                break;
                        }
                        break;
                }
                System.out.printf("The price is %.2flv! Have a nice time!", totalPrice);
            }
        } else {
            System.out.println("Days must be positive number!");
        }
    }
}
