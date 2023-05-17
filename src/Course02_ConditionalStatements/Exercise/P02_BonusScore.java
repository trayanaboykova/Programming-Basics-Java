package Module01_ProgrammingBasics.Course02_ConditionalStatements.Exercise;

import java.util.Scanner;

public class P02_BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int number = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        if (number <= 100) {
            bonus = bonus + 5;
            // bonus += 5
        } else if (number <= 1000) {
            bonus = number * 0.20;
            // bonus = number * (20 / 100);
        } else {
            bonus = number * 0.10;
            // bonus = number * (10 / 100);
        }

        if (number % 2 == 0) {
            bonus += 1;
        }
        if (number % 10 == 5) {
            bonus += 2;
        }

        System.out.println(bonus);
        System.out.println(number + bonus);
    }
}
