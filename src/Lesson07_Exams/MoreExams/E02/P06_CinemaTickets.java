package Lesson07_Exams.MoreExams.E02;

import java.util.Scanner;

public class P06_CinemaTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String film = scanner.nextLine();

        int totalTickets = 0;
        int studentTickets = 0;
        int standardTickets = 0;
        int kidTickets = 0;

        while (!film.equals("Finish")) {
            int seats = Integer.parseInt(scanner.nextLine());

            int soldTickets = 0;
            String ticketType = scanner.nextLine();

            while (!ticketType.equals("End")) {
                switch (ticketType) {
                    case "student":
                        studentTickets++;
                        break;
                    case "standard":
                        standardTickets++;
                        break;
                    case "kid":
                        kidTickets++;
                        break;
                }

                soldTickets++;
                totalTickets++;

                if (soldTickets == seats) {
                    break;
                }

                ticketType = scanner.nextLine();
            }

            double percentageFull = soldTickets * 1.0 / seats * 100;
            System.out.printf("%s - %.2f%% full.%n", film, percentageFull);

            film = scanner.nextLine();
        }

        System.out.printf("Total tickets: %d%n", totalTickets);
        System.out.printf("%.2f%% student tickets.%n", studentTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% standard tickets.%n", standardTickets * 1.0 / totalTickets * 100);
        System.out.printf("%.2f%% kids tickets.", kidTickets * 1.0 / totalTickets * 100);
    }
}

