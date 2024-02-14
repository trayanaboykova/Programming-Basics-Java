package Lecture07_Exams.MoreExams.E08;

import java.util.Scanner;

public class P01_AgencyProfit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String airlineName = scanner.nextLine();
        int adultTickets = Integer.parseInt(scanner.nextLine());
        int childTickets = Integer.parseInt(scanner.nextLine());
        double adultTicketPrice = Double.parseDouble(scanner.nextLine());
        double serviceFee = Double.parseDouble(scanner.nextLine());

        double childTicketPrice = adultTicketPrice - (0.7 * adultTicketPrice);
        double totalAdultPrice = adultTickets * (adultTicketPrice + serviceFee);
        double totalChildPrice = childTickets * (childTicketPrice + serviceFee);
        double totalProfit = (totalAdultPrice + totalChildPrice) * 0.2;

        System.out.printf("The profit of your agency from %s tickets is %.2f lv.", airlineName, totalProfit);
    }
}
