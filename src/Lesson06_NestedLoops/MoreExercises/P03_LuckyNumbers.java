package Lesson06_NestedLoops.MoreExercises;

import java.util.Scanner;

public class P03_LuckyNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.nextLine());
        StringBuilder output = new StringBuilder();

        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                int firstTwoSum = a + b;
                if (N % firstTwoSum == 0) {
                    for (int c = 1; c <= 9; c++) {
                        for (int d = 1; d <= 9; d++) {
                            if (firstTwoSum == (c + d)) {
                                String number = "" + a + b + c + d;
                                output.append(number).append(" ");
                            }
                        }
                    }
                }
            }
        }

        System.out.println(output.toString().trim());
    }
}
