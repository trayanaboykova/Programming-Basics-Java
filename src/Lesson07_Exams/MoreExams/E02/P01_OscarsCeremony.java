package Lesson07_Exams.MoreExams.E02;

import java.util.Scanner;

public class P01_OscarsCeremony {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int hallRent = Integer.parseInt(scanner.nextLine());

        double statuettesPrice = hallRent * 0.7;
        double cateringPrice = statuettesPrice * 0.85;
        double soundSystemPrice = cateringPrice / 2;

        double totalExpenses = hallRent + statuettesPrice + cateringPrice + soundSystemPrice;

        System.out.printf("%.2f", totalExpenses);
    }
}
