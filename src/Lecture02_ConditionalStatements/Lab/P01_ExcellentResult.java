package Lecture02_ConditionalStatements.Lab;

import java.util.Scanner;

public class P01_ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int grade = Integer.parseInt(scanner.nextLine());

        // отпечатва "Excellent!", ако оценката е 5 или по-висока
        if (grade >= 5){
            System.out.println("Excellent!");
        }

    }
}
