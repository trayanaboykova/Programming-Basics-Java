package Lecture07_Exams.MoreExams.E08;

import java.util.Scanner;

public class P05_BestPlayer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String bestPlayer = "";
        int bestGoals = 0;
        boolean hatTrick = false;

        while (true) {
            String playerName = scanner.nextLine();
            if (playerName.equals("END")) {
                break;
            }

            int goals = Integer.parseInt(scanner.nextLine());

            if (goals >= 10) {
                bestPlayer = playerName;
                bestGoals = goals;
                hatTrick = true;
                break;
            }

            if (goals > bestGoals) {
                bestPlayer = playerName;
                bestGoals = goals;
                if (goals >= 3) {
                    hatTrick = true;
                } else {
                    hatTrick = false;
                }
            }
        }

        System.out.println(bestPlayer + " is the best player!");
        if (hatTrick) {
            System.out.println("He has scored " + bestGoals + " goals and made a hat-trick !!!");
        } else {
            System.out.println("He has scored " + bestGoals + " goals.");
        }
    }
}
