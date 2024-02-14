package Lecture03_ConditionalStatementsAdvanced.MoreExercises;

import java.util.Scanner;

public class P07_SchoolCamp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String season = scanner.nextLine();
        String groupType = scanner.nextLine();
        int studentsCount = Integer.parseInt(scanner.nextLine());
        int nightsCount = Integer.parseInt(scanner.nextLine());

        double pricePerNight = 0;
        String sport = "";

        switch (season) {
            case "Winter":
                if (groupType.equals("boys")) {
                    pricePerNight = 9.60;
                    sport = "Judo";
                } else if (groupType.equals("girls")) {
                    pricePerNight = 9.60;
                    sport = "Gymnastics";
                } else if (groupType.equals("mixed")) {
                    pricePerNight = 10;
                    sport = "Ski";
                }
                break;
            case "Spring":
                if (groupType.equals("boys")) {
                    pricePerNight = 7.20;
                    sport = "Tennis";
                } else if (groupType.equals("girls")) {
                    pricePerNight = 7.20;
                    sport = "Athletics";
                } else if (groupType.equals("mixed")) {
                    pricePerNight = 9.50;
                    sport = "Cycling";
                }
                break;
            case "Summer":
                if (groupType.equals("boys")) {
                    pricePerNight = 15;
                    sport = "Football";
                } else if (groupType.equals("girls")) {
                    pricePerNight = 15;
                    sport = "Volleyball";
                } else if (groupType.equals("mixed")) {
                    pricePerNight = 20;
                    sport = "Swimming";
                }
                break;
        }

        double totalPrice = pricePerNight * nightsCount * studentsCount;

        if (studentsCount >= 50) {
            totalPrice *= 0.50;
        } else if (studentsCount >= 20) {
            totalPrice *= 0.85;
        } else if (studentsCount >= 10) {
            totalPrice *= 0.95;
        }

        System.out.printf("%s %.2f lv.", sport, totalPrice);
    }
}
