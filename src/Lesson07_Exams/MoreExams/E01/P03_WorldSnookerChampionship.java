package Lesson07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P03_WorldSnookerChampionship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String stage = scanner.nextLine();
        String ticketType = scanner.nextLine();
        int numberOfTickets = Integer.parseInt(scanner.nextLine());
        String trophyPhoto = scanner.nextLine();

        double ticketPrice = 0;
        double totalPrice = 0;

        switch (stage) {
            case "Quarter final":
                switch (ticketType) {
                    case "Standard":
                        ticketPrice = 55.50;
                        break;
                    case "Premium":
                        ticketPrice = 105.20;
                        break;
                    case "VIP":
                        ticketPrice = 118.90;
                        break;
                }
                break;
            case "Semi final":
                switch (ticketType) {
                    case "Standard":
                        ticketPrice = 75.88;
                        break;
                    case "Premium":
                        ticketPrice = 125.22;
                        break;
                    case "VIP":
                        ticketPrice = 300.40;
                        break;
                }
                break;
            case "Final":
                switch (ticketType) {
                    case "Standard":
                        ticketPrice = 110.10;
                        break;
                    case "Premium":
                        ticketPrice = 160.66;
                        break;
                    case "VIP":
                        ticketPrice = 400;
                        break;
                }
                break;
        }

        totalPrice = ticketPrice * numberOfTickets;

        if (totalPrice > 2500 && totalPrice <= 4000) {
            totalPrice = totalPrice - (totalPrice * 0.1);
            if (trophyPhoto.equals("Y")) {
                totalPrice += numberOfTickets * 40;
            }
        } else if (totalPrice > 4000) {
            totalPrice = totalPrice - (totalPrice * 0.25);

        } else if (totalPrice <= 2500) {
            if (trophyPhoto.equals("Y")) {
                totalPrice += numberOfTickets * 40;
            }
        }
        System.out.printf("%.2f%n", totalPrice);
    }
}
