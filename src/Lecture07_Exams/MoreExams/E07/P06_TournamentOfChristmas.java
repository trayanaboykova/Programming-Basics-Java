package Lecture07_Exams.MoreExams.E07;

import java.util.Scanner;

public class P06_TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int days = Integer.parseInt(scanner.nextLine());
        int totalWins = 0;
        int totalGames = 0;
        double totalMoney = 0;

        for (int i = 0; i < days; i++) {
            int dailyWins = 0;
            int dailyGames = 0;
            double dailyMoney = 0;

            String input = scanner.nextLine();
            while (!input.equals("Finish")) {
                String result = scanner.nextLine();
                if (result.equals("win")) {
                    dailyWins++;
                    totalWins++;
                    dailyMoney += 20;
                }
                dailyGames++;
                totalGames++;
                input = scanner.nextLine();
            }

            if (dailyWins > dailyGames - dailyWins) {
                dailyMoney *= 1.1;
            }

            totalMoney += dailyMoney;
        }

        if (totalWins > totalGames - totalWins) {
            totalMoney *= 1.2;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }
    }
}
