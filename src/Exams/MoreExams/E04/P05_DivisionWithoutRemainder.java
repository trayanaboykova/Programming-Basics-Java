package Exams.MoreExams.E04;

import java.util.Scanner;

public class P05_DivisionWithoutRemainder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        int countDivisibleBy2 = 0;
        int countDivisibleBy3 = 0;
        int countDivisibleBy4 = 0;

        for (int i = 0; i < n; i++) {
            int number = Integer.parseInt(scanner.nextLine());

            if (number % 2 == 0) {
                countDivisibleBy2++;
            }
            if (number % 3 == 0) {
                countDivisibleBy3++;
            }
            if (number % 4 == 0) {
                countDivisibleBy4++;
            }
        }

        double percentageDivisibleBy2 = (double) countDivisibleBy2 / n * 100;
        double percentageDivisibleBy3 = (double) countDivisibleBy3 / n * 100;
        double percentageDivisibleBy4 = (double) countDivisibleBy4 / n * 100;

        System.out.printf("%.2f%%%n", percentageDivisibleBy2);
        System.out.printf("%.2f%%%n", percentageDivisibleBy3);
        System.out.printf("%.2f%%%n", percentageDivisibleBy4);
    }
}
