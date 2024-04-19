package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P05_ChallengeTheWedding {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maleCount = Integer.parseInt(scanner.nextLine());
        int femaleCount = Integer.parseInt(scanner.nextLine());
        int maxTables = Integer.parseInt(scanner.nextLine());

        StringBuilder output = new StringBuilder();
        int tables = 0;

        for (int male = 1; male <= maleCount; male++) {
            for (int female = 1; female <= femaleCount; female++) {
                output.append("(").append(male).append(" <-> ").append(female).append(") ");
                tables++;

                if (tables == maxTables || male == maleCount && female == femaleCount) {
                    System.out.println(output.toString().trim());
                    scanner.close();
                    return;
                }
            }
        }

        System.out.println(output.toString().trim());

    }
}
