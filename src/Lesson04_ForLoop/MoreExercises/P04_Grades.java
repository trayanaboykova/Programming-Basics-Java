package Lesson04_ForLoop.MoreExercises;

import java.util.Scanner;

public class P04_Grades {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int numberOfStudents = Integer.parseInt(scanner.nextLine());
        double[] grades = new double[numberOfStudents];

        for (int i = 0; i < numberOfStudents; i++) {
            grades[i] = Double.parseDouble(scanner.nextLine());
        }

        int countTopStudents = 0;
        int countGoodStudents = 0;
        int countAverageStudents = 0;
        int countFailStudents = 0;

        double totalSum = 0;

        for (double grade : grades) {
            if (grade >= 5.00) {
                countTopStudents++;
            } else if (grade >= 4.00) {
                countGoodStudents++;
            } else if (grade >= 3.00) {
                countAverageStudents++;
            } else {
                countFailStudents++;
            }
            totalSum += grade;
        }

        double percentTopStudents = (double) countTopStudents / numberOfStudents * 100;
        double percentGoodStudents = (double) countGoodStudents / numberOfStudents * 100;
        double percentAverageStudents = (double) countAverageStudents / numberOfStudents * 100;
        double percentFailStudents = (double) countFailStudents / numberOfStudents * 100;

        double averageGrade = totalSum / numberOfStudents;

        System.out.printf("Top students: %.2f%%\n", percentTopStudents);
        System.out.printf("Between 4.00 and 4.99: %.2f%%\n", percentGoodStudents);
        System.out.printf("Between 3.00 and 3.99: %.2f%%\n", percentAverageStudents);
        System.out.printf("Fail: %.2f%%\n", percentFailStudents);
        System.out.printf("Average: %.2f\n", averageGrade);
    }
}
