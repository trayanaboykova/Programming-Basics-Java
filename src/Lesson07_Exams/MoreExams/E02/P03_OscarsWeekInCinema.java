package Lesson07_Exams.MoreExams.E02;

import java.util.Scanner;

public class P03_OscarsWeekInCinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();
        String hallType = scanner.nextLine();
        int ticketsCount = Integer.parseInt(scanner.nextLine());

        double ticketPrice = 0;

        switch (film) {
            case "A Star Is Born":
                switch (hallType) {
                    case "normal":
                        ticketPrice = 7.50;
                        break;
                    case "luxury":
                        ticketPrice = 10.50;
                        break;
                    case "ultra luxury":
                        ticketPrice = 13.50;
                        break;
                }
                break;
            case "Bohemian Rhapsody":
                switch (hallType) {
                    case "normal":
                        ticketPrice = 7.35;
                        break;
                    case "luxury":
                        ticketPrice = 9.45;
                        break;
                    case "ultra luxury":
                        ticketPrice = 12.75;
                        break;
                }
                break;
            case "Green Book":
                switch (hallType) {
                    case "normal":
                        ticketPrice = 8.15;
                        break;
                    case "luxury":
                        ticketPrice = 10.25;
                        break;
                    case "ultra luxury":
                        ticketPrice = 13.25;
                        break;
                }
                break;
            case "The Favourite":
                switch (hallType) {
                    case "normal":
                        ticketPrice = 8.75;
                        break;
                    case "luxury":
                        ticketPrice = 11.55;
                        break;
                    case "ultra luxury":
                        ticketPrice = 13.95;
                        break;
                }
                break;
        }

        double totalIncome = ticketPrice * ticketsCount;

        System.out.printf("%s -> %.2f lv.", film, totalIncome);
    }
}
