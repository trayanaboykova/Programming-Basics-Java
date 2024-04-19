package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P04_CarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = Integer.parseInt(scanner.nextLine());
        int end = Integer.parseInt(scanner.nextLine());
        StringBuilder output = new StringBuilder();

        for (int a = start; a <= end; a++) {
            for (int b = start; b <= end; b++) {
                for (int c = start; c <= end; c++) {
                    for (int d = start; d <= end; d++) {
                        if (isValidNumber(a, b, c, d)) {
                            output.append(a).append(b).append(c).append(d).append(" ");
                        }
                    }
                }
            }
        }

        System.out.println(output.toString().trim());
    }

    private static boolean isValidNumber(int a, int b, int c, int d) {
        boolean startEndCondition = (a % 2 == 0 && d % 2 != 0) || (a % 2 != 0 && d % 2 == 0);
        boolean firstLastDigitCondition = a > d;
        boolean secondThirdSumCondition = (b + c) % 2 == 0;

        return startEndCondition && firstLastDigitCondition && secondThirdSumCondition;
    }
}
