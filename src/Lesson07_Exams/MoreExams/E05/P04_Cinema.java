package Lesson07_Exams.MoreExams.E05;

import java.util.Scanner;

public class P04_Cinema {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int capacity = Integer.parseInt(scanner.nextLine());
        int totalIncome = 0;

        while (true) {
            String input = scanner.nextLine();
            if (input.equals("Movie time!")) {
                System.out.printf("There are %d seats left in the cinema.%n", capacity);
                break;
            }

            int peopleCount = Integer.parseInt(input);

            if (peopleCount > capacity) {
                System.out.println("The cinema is full.");
                break;
            }

            capacity -= peopleCount;
            int currentIncome = peopleCount * 5;
            if (peopleCount % 3 == 0) {
                currentIncome -= 5;
            }
            totalIncome += currentIncome;
        }

        System.out.printf("Cinema income - %d lv.", totalIncome);
    }
}
