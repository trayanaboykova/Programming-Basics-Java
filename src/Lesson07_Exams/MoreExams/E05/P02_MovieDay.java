package Lesson07_Exams.MoreExams.E05;

import java.util.Scanner;

public class P02_MovieDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int filmingTime = Integer.parseInt(scanner.nextLine());
        int scenes = Integer.parseInt(scanner.nextLine());
        int sceneDuration = Integer.parseInt(scanner.nextLine());

        int preparationTime = (int) (filmingTime * 0.15);
        int totalScenesTime = scenes * sceneDuration;
        int totalTimeNeeded = preparationTime + totalScenesTime;

        if (totalTimeNeeded <= filmingTime) {
            int timeLeft = filmingTime - totalTimeNeeded;
            System.out.printf("You managed to finish the movie on time! You have %d minutes left!", timeLeft);
        } else {
            int timeNeeded = totalTimeNeeded - filmingTime;
            System.out.printf("Time is up! To complete the movie you need %d minutes.", timeNeeded);
        }
    }
}
