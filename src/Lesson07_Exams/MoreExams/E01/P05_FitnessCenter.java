package Lesson07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P05_FitnessCenter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int totalVisitors = Integer.parseInt(scanner.nextLine());

        int backCount = 0;
        int chestCount = 0;
        int legsCount = 0;
        int absCount = 0;
        int proteinShakeCount = 0;
        int proteinBarCount = 0;

        for (int i = 0; i < totalVisitors; i++) {
            String activity = scanner.nextLine();

            switch (activity) {
                case "Back":
                    backCount++;
                    break;
                case "Chest":
                    chestCount++;
                    break;
                case "Legs":
                    legsCount++;
                    break;
                case "Abs":
                    absCount++;
                    break;
                case "Protein shake":
                    proteinShakeCount++;
                    break;
                case "Protein bar":
                    proteinBarCount++;
                    break;
            }
        }

        double workoutPercentage = (double) (backCount + chestCount + legsCount + absCount) / totalVisitors * 100;
        double proteinPercentage = (double) (proteinShakeCount + proteinBarCount) / totalVisitors * 100;

        System.out.printf("%d - back%n", backCount);
        System.out.printf("%d - chest%n", chestCount);
        System.out.printf("%d - legs%n", legsCount);
        System.out.printf("%d - abs%n", absCount);
        System.out.printf("%d - protein shake%n", proteinShakeCount);
        System.out.printf("%d - protein bar%n", proteinBarCount);
        System.out.printf("%.2f%% - work out%n", workoutPercentage);
        System.out.printf("%.2f%% - protein%n", proteinPercentage);
    }
}
