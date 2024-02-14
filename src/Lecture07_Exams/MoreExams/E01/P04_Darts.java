package Lecture07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P04_Darts {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String playerName = scanner.nextLine();
        int points = 301;
        int successfulShots = 0;
        int unsuccessfulShots = 0;

        while (true) {
            String shotType = scanner.nextLine();
            if (shotType.equals("Retire")) {
                System.out.printf("%s retired after %d unsuccessful shots.", playerName, unsuccessfulShots);
                break;
            }
            int pointsHit = Integer.parseInt(scanner.nextLine());

            if (shotType.equals("Single")) {
                pointsHit *= 1;
            } else if (shotType.equals("Double")) {
                pointsHit *= 2;
            } else if (shotType.equals("Triple")) {
                pointsHit *= 3;
            }

            if (pointsHit <= points) {
                points -= pointsHit;
                successfulShots++;
            } else {
                unsuccessfulShots++;
            }

            if (points == 0) {
                System.out.printf("%s won the leg with %d shots.", playerName, successfulShots);
                break;
            }
        }

        scanner.close();
    }
}
