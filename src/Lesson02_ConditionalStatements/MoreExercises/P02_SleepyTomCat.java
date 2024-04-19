package Lesson02_ConditionalStatements.MoreExercises;

import java.util.Scanner;

public class P02_SleepyTomCat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int restDays = Integer.parseInt(scanner.nextLine());

        int workDays = 365 - restDays;
        int playTime = workDays * 63 + restDays * 127;

        int difference = Math.abs(30000 - playTime);
        int hoursDifference = difference / 60;
        int minutesDifference = difference % 60;

        if (playTime > 30000) {
            System.out.println("Tom will run away");
            System.out.printf("%d hours and %d minutes more for play", hoursDifference, minutesDifference);
        } else {
            System.out.println("Tom sleeps well");
            System.out.printf("%d hours and %d minutes less for play", hoursDifference, minutesDifference);
        }
    }
}
