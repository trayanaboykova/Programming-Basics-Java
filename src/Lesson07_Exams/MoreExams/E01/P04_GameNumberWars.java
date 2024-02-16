package Lesson07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P04_GameNumberWars {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String firstPlayer = scanner.nextLine();
        String secondPlayer = scanner.nextLine();

        int firstPlayerPoints = 0;
        int secondPlayerPoints = 0;

        String input = scanner.nextLine();

        while (!input.equals("End of game")) {
            int firstPlayerCard = Integer.parseInt(input);
            int secondPlayerCard = Integer.parseInt(scanner.nextLine());

            if (firstPlayerCard > secondPlayerCard) {
                firstPlayerPoints += firstPlayerCard - secondPlayerCard;
            } else if (secondPlayerCard > firstPlayerCard) {
                secondPlayerPoints += secondPlayerCard - firstPlayerCard;
            } else {
                System.out.println("Number wars!");
                int additionalFirstPlayerCard = Integer.parseInt(scanner.nextLine());
                int additionalSecondPlayerCard = Integer.parseInt(scanner.nextLine());

                if (additionalFirstPlayerCard > additionalSecondPlayerCard) {
                    System.out.printf("%s is winner with %d points%n", firstPlayer, firstPlayerPoints);
                    return;
                } else {
                    System.out.printf("%s is winner with %d points%n", secondPlayer, secondPlayerPoints);
                    return;
                }
            }

            input = scanner.nextLine();
        }

        System.out.printf("%s has %d points%n", firstPlayer, firstPlayerPoints);
        System.out.printf("%s has %d points%n", secondPlayer, secondPlayerPoints);
    }
}
