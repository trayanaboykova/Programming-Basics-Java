package Exams.MoreExams.E05;

import java.util.Scanner;

public class P01_MovieProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String movieName = scanner.nextLine();
        int days = Integer.parseInt(scanner.nextLine());
        int tickets = Integer.parseInt(scanner.nextLine());
        double ticketPrice = Double.parseDouble(scanner.nextLine());
        int cinemaPercentage = Integer.parseInt(scanner.nextLine());

        double dailyIncome = tickets * ticketPrice;
        double totalIncome = dailyIncome * days;
        double cinemaIncome = totalIncome * cinemaPercentage / 100;
        double studioIncome = totalIncome - cinemaIncome;

        System.out.printf("The profit from the movie %s is %.2f lv.", movieName, studioIncome);
    }
}
