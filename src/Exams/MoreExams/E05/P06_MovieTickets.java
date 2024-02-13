package Exams.MoreExams.E05;

import java.util.Scanner;

public class P06_MovieTickets {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a1 = Integer.parseInt(scanner.nextLine());
        int a2 = Integer.parseInt(scanner.nextLine());
        int n = Integer.parseInt(scanner.nextLine());

        for (int i = a1; i < a2; i++) {
            char symbol1 = (char) i;

            for (int j = 1; j < n; j++) {
                for (int k = 1; k < n / 2; k++) {
                    int symbol2 = j;
                    int symbol3 = k;
                    int symbol4 = i;

                    if (i % 2 != 0 && (symbol2 + symbol3 + symbol4) % 2 != 0) {
                        System.out.printf("%c-%d%d%d%n", symbol1, symbol2, symbol3, symbol4);
                    }
                }
            }
        }
    }
}
