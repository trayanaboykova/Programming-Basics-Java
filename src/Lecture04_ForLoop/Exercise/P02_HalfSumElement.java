package Lecture04_ForLoop.Exercise;

import java.util.Scanner;

public class P02_HalfSumElement {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int maxNum = Integer.MIN_VALUE;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            int currentNum = Integer.parseInt(scanner.nextLine());

            sum += currentNum;
            if (maxNum < currentNum) {
                maxNum = currentNum;
            }

        }

        int sumWithoutMaxNum = sum - maxNum;

        if (sumWithoutMaxNum == maxNum) {
            System.out.println("Yes");
            System.out.printf("Sum = %d", sumWithoutMaxNum);
        } else {
            System.out.println("No");
            System.out.printf("Diff = %d%n", Math.abs(maxNum - sumWithoutMaxNum));
        }


    }
}


