package Lesson04_ForLoop.MoreExercises;

import java.util.Scanner;

public class P07_FootballLeague {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int stadiumCapacity = Integer.parseInt(scanner.nextLine());
        int numberOfFans = Integer.parseInt(scanner.nextLine());

        int countA = 0;
        int countB = 0;
        int countV = 0;
        int countG = 0;

        for (int i = 0; i < numberOfFans; i++) {
            String sector = scanner.nextLine().trim();
            switch (sector) {
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "V":
                    countV++;
                    break;
                case "G":
                    countG++;
                    break;
                default:
                    break;
            }
        }

        double percentA = (double) countA / numberOfFans * 100;
        double percentB = (double) countB / numberOfFans * 100;
        double percentV = (double) countV / numberOfFans * 100;
        double percentG = (double) countG / numberOfFans * 100;

        double percentFansCapacity = (double) numberOfFans / stadiumCapacity * 100;

        System.out.printf("%.2f%%%n", percentA);
        System.out.printf("%.2f%%%n", percentB);
        System.out.printf("%.2f%%%n", percentV);
        System.out.printf("%.2f%%%n", percentG);
        System.out.printf("%.2f%%%n", percentFansCapacity);

    }
}
