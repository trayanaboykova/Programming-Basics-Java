package Exams.MoreExams.E05;

import java.util.Scanner;

public class P03_FilmPremiere {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String projection = scanner.nextLine();
        String packageType = scanner.nextLine();
        int tickets = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;
        double totalBill = 0;

        switch (projection) {
            case "John Wick":
                switch (packageType) {
                    case "Drink":
                        ticketPrice = 12;
                        break;
                    case "Popcorn":
                        ticketPrice = 15;
                        break;
                    case "Menu":
                        ticketPrice = 19;
                        break;
                }
                break;
            case "Star Wars":
                switch (packageType) {
                    case "Drink":
                        ticketPrice = 18;
                        break;
                    case "Popcorn":
                        ticketPrice = 25;
                        break;
                    case "Menu":
                        ticketPrice = 30;
                        break;
                }
                if (tickets >= 4) {
                    totalBill = ticketPrice * tickets * 0.7; // 30% discount for 4 or more tickets
                }
                break;
            case "Jumanji":
                switch (packageType) {
                    case "Drink":
                        ticketPrice = 9;
                        break;
                    case "Popcorn":
                        ticketPrice = 11;
                        break;
                    case "Menu":
                        ticketPrice = 14;
                        break;
                }
                if (tickets == 2) {
                    totalBill = ticketPrice * tickets * 0.85; // 15% discount for exactly 2 tickets
                }
                break;
        }

        if (totalBill == 0) {
            totalBill = ticketPrice * tickets;
        }

        System.out.printf("Your bill is %.2f leva.", totalBill);
    }
}
