package Lesson04_ForLoop.Exercise;

import java.util.Scanner;

public class P08_TennisRankList {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int games = Integer.parseInt(scan.nextLine());
        int startPoints = Integer.parseInt(scan.nextLine());
        int win = 0;
        int points = 0;

        for (int i = 0; i < games; i++) {
            String type = scan.nextLine();
            if (type.equals("W")) {
                points += 2000;
                win++;
            } else if (type.equals("F")) {
                points += 1200;
            } else {
                points += 720;
            }


        }
        double percentWin = (win * 1.00 / games) * 100;
        int totalPoints = startPoints + points;


        System.out.printf("Final points: %d%n", totalPoints);
        System.out.printf("Average points: %d%n", points / games);
        System.out.printf("%.2f%%", percentWin);


    }

}

