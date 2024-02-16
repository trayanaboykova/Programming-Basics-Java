package Lesson07_Exams.MoreExams.E07;

import java.util.Scanner;

public class P02_CatWalking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int minutesPerWalk = Integer.parseInt(scanner.nextLine());
        int walksPerDay = Integer.parseInt(scanner.nextLine());
        int caloriesIntakePerDay = Integer.parseInt(scanner.nextLine());

        int totalMinutesPerDay = minutesPerWalk * walksPerDay;
        int burnedCaloriesPerDay = totalMinutesPerDay * 5;

        if (burnedCaloriesPerDay >= caloriesIntakePerDay * 0.5) {
            System.out.printf("Yes, the walk for your cat is enough. Burned calories per day: %d.",
                    burnedCaloriesPerDay);
        } else {
            System.out.printf("No, the walk for your cat is not enough. Burned calories per day: %d.",
                    burnedCaloriesPerDay);
        }
    }
}
