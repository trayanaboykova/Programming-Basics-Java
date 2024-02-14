package Lecture07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P02_Skeleton {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int controlMinutes = Integer.parseInt(scanner.nextLine());
        int controlSeconds = Integer.parseInt(scanner.nextLine());
        double trackLength = Double.parseDouble(scanner.nextLine());
        int secondsPer100m = Integer.parseInt(scanner.nextLine());

        int controlTimeInSeconds = controlMinutes * 60 + controlSeconds;
        double timeReduction = (trackLength / 120) * 2.5;
        double marinTime = (trackLength / 100) * secondsPer100m - timeReduction;

        if (marinTime <= controlTimeInSeconds) {
            System.out.printf("Marin Bangiev won an Olympic quota!%nHis time is %.3f.%n", marinTime);
        } else {
            double timeDifference = marinTime - controlTimeInSeconds;
            System.out.printf("No, Marin failed! He was %.3f second slower.%n", timeDifference);
        }
    }
}
