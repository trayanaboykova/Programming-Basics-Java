package Lecture07_Exams.MoreExams.E07;

import java.util.Scanner;

public class P02_MountainRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double recordSeconds = Double.parseDouble(scanner.nextLine());
        double distanceMeters = Double.parseDouble(scanner.nextLine());
        double secondsPerMeter = Double.parseDouble(scanner.nextLine());

        double climbTime = distanceMeters * secondsPerMeter;

        double additionalTime = Math.floor(distanceMeters / 50) * 30;

        climbTime += additionalTime;

        if (climbTime < recordSeconds) {
            System.out.printf("Yes! The new record is %.2f seconds.", climbTime);
        } else {
            double timeDifference = climbTime - recordSeconds;
            System.out.printf("No! He was %.2f seconds slower.", timeDifference);
        }
    }
}
