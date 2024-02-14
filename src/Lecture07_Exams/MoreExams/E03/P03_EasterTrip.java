package Lecture07_Exams.MoreExams.E03;

import java.util.Scanner;

public class P03_EasterTrip {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] prices = {
                {30, 35, 40},
                {28, 32, 39},
                {32, 37, 43}
        };

        String destination = scanner.nextLine();
        String dates = scanner.nextLine();
        int nights = Integer.parseInt(scanner.nextLine());

        int destinationIndex = -1;
        int datesIndex = -1;

        switch (destination) {
            case "France":
                destinationIndex = 0;
                break;
            case "Italy":
                destinationIndex = 1;
                break;
            case "Germany":
                destinationIndex = 2;
                break;
        }

        switch (dates) {
            case "21-23":
                datesIndex = 0;
                break;
            case "24-27":
                datesIndex = 1;
                break;
            case "28-31":
                datesIndex = 2;
                break;
        }

        double totalCost = nights * prices[destinationIndex][datesIndex];

        System.out.printf("Easter trip to %s : %.2f leva.", destination, totalCost);
    }
}
