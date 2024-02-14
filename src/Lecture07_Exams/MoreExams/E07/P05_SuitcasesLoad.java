package Lecture07_Exams.MoreExams.E07;

import java.util.Scanner;

public class P05_SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double casesTotalCapacity = 0;
        int casesCount = 0, count = 0;
        boolean isEnd = false;
        double capacity = Double.parseDouble(scanner.nextLine());
        String input = scanner.nextLine();

        while (!input.equals("End")) {

            double cases = Double.parseDouble(input);
            count++;

            if (count % 3 == 0) {
                casesTotalCapacity = casesTotalCapacity +  (cases + (cases * 0.1));
            } else {
                casesTotalCapacity += cases;
            }

            if (casesTotalCapacity > capacity) {
                break;
            }

            casesCount++;

            input = scanner.nextLine();
        }

        if (capacity >= casesTotalCapacity) {
            System.out.println("Congratulations! All suitcases are loaded!");
            System.out.printf("Statistic: %d suitcases loaded.", casesCount);
        } else if (casesTotalCapacity > capacity) {
            System.out.println("No more space!");
            System.out.printf("Statistic: %d suitcases loaded.", casesCount);
        }
    }
}
