package Lesson07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P03_Gymnastics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String country = scanner.nextLine();
        String apparatus = scanner.nextLine();

        double difficulty = 0;
        double execution = 0;

        switch (country) {
            case "Russia":
                switch (apparatus) {
                    case "ribbon":
                        difficulty = 9.100;
                        execution = 9.400;
                        break;
                    case "hoop":
                        difficulty = 9.300;
                        execution = 9.800;
                        break;
                    case "rope":
                        difficulty = 9.600;
                        execution = 9.000;
                        break;
                }
                break;
            case "Bulgaria":
                switch (apparatus) {
                    case "ribbon":
                        difficulty = 9.600;
                        execution = 9.400;
                        break;
                    case "hoop":
                        difficulty = 9.550;
                        execution = 9.750;
                        break;
                    case "rope":
                        difficulty = 9.500;
                        execution = 9.400;
                        break;
                }
                break;
            case "Italy":
                switch (apparatus) {
                    case "ribbon":
                        difficulty = 9.200;
                        execution = 9.500;
                        break;
                    case "hoop":
                        difficulty = 9.450;
                        execution = 9.350;
                        break;
                    case "rope":
                        difficulty = 9.700;
                        execution = 9.150;
                        break;
                }
                break;
        }

        double totalScore = difficulty + execution;
        double pointsNeeded = 20 - totalScore;
        double percentageNeeded = (pointsNeeded / 20) * 100;

        System.out.printf("The team of %s get %.3f on %s.%n", country, totalScore, apparatus);
        System.out.printf("%.2f%%%n", percentageNeeded);
    }
}
