package Lesson07_Exams.MoreExams.E08;

import java.util.Scanner;

public class P04_Balls {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalPoints = 0;
        int redCount = 0;
        int orangeCount = 0;
        int yellowCount = 0;
        int whiteCount = 0;
        int otherColorsCount = 0;
        int blackDivisionsCount = 0;

        int N = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < N; i++) {
            String color = scanner.nextLine();

            switch (color) {
                case "red":
                    totalPoints += 5;
                    redCount++;
                    break;
                case "orange":
                    totalPoints += 10;
                    orangeCount++;
                    break;
                case "yellow":
                    totalPoints += 15;
                    yellowCount++;
                    break;
                case "white":
                    totalPoints += 20;
                    whiteCount++;
                    break;
                case "black":
                    totalPoints /= 2;
                    blackDivisionsCount++;
                    break;
                default:
                    otherColorsCount++;
            }
        }

        System.out.println("Total points: " + totalPoints);
        System.out.println("Red balls: " + redCount);
        System.out.println("Orange balls: " + orangeCount);
        System.out.println("Yellow balls: " + yellowCount);
        System.out.println("White balls: " + whiteCount);
        System.out.println("Other colors picked: " + otherColorsCount);
        System.out.println("Divides from black balls: " + blackDivisionsCount);
    }
}
