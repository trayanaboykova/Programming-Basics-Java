package Lecture07_Exams.MoreExams.E01;

import java.util.Scanner;

public class P06_HighJump {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int desiredHeight = Integer.parseInt(scanner.nextLine());
        int currentHeight = desiredHeight - 30;
        int jumps = 0;
        int failedAttempts = 0;

        while (true) {
            int jumpHeight = Integer.parseInt(scanner.nextLine());
            jumps++;

            if (jumpHeight > currentHeight) {
                currentHeight += 5;
                failedAttempts = 0;
            } else {
                failedAttempts++;
            }

            if (failedAttempts == 3) {
                System.out.printf("Tihomir failed at %dcm after %d jumps.", currentHeight, jumps);
                break;
            } else if (currentHeight > desiredHeight) {
                System.out.printf("Tihomir succeeded, he jumped over %dcm after %d jumps.", currentHeight - 5, jumps);
                break;
            }
        }
    }
}
